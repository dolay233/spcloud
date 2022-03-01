package com.exam.controller;

import com.exam.pojo.Item;
import com.exam.pojo.Order;
import com.exam.pojo.User;
import com.exam.service.ItemFeignService;
import com.exam.service.OrderFeignService;
import com.exam.service.UserFeignService;
import com.exam.util.JsonResult;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FeignController {
  @Autowired
  private ItemFeignService itemService;
  @Autowired
  private UserFeignService userService;
  @Autowired
  private OrderFeignService orderService;

  @GetMapping("/item-service/{orderId}")
  public JsonResult<List<Item>> getItems(@PathVariable String orderId) {
    return itemService.getItems(orderId);
  }

  @PostMapping("/item-service/decreaseNumber")
  public JsonResult decreaseNumber(@RequestBody List<Item> items) {
    return itemService.decreaseNumber(items);
  }

	//

  @GetMapping("/user-service/{userId}")
  public JsonResult<User> getUser(@PathVariable Integer userId) {
    return userService.getUser(userId);
  }

  @GetMapping("/user-service/{userId}/score")
  public JsonResult addScore(@PathVariable Integer userId, Integer score) {
    return userService.addScore(userId, score);
  }

	//

  @GetMapping("/order-service/{orderId}")
  public JsonResult<Order> getOrder(@PathVariable String orderId) {
    return orderService.getOrder(orderId);
  }

  @GetMapping("/order-service")
  public JsonResult addOrder() {
    return orderService.addOrder();
  }
}
