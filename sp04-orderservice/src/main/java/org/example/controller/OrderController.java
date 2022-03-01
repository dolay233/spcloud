package org.example.controller;


import java.util.Arrays;

import org.exam.pojo.Item;
import org.exam.pojo.Order;
import org.exam.pojo.User;
import org.exam.service.OrderService;
import org.exam.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class OrderController {
  @Autowired
  private OrderService orderService;

  @GetMapping("/{orderId}")
  public JsonResult<Order> getOrder(@PathVariable String orderId) {
    log.info("get order, id="+orderId);

    Order order = orderService.getOrder(orderId);
    return JsonResult.ok(order);
  }

  @GetMapping("/")
  public JsonResult addOrder() {
    //模拟post提交的数据
    Order order = new Order();
    order.setId("123abc");
    order.setUser(new User(7,null,null));
    order.setItems(Arrays.asList(new Item[] {
        new Item(1,"aaa",2),
        new Item(2,"bbb",1),
        new Item(3,"ccc",3),
        new Item(4,"ddd",1),
        new Item(5,"eee",5),
    }));
    orderService.addOrder(order);
    return JsonResult.ok();
  }
}