package com.exam.service;


import com.exam.pojo.Order;
import com.exam.service.impl.OrderFeignServiceFB;
import com.exam.util.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "order-service",fallback = OrderFeignServiceFB.class)
public interface OrderFeignService {
  @GetMapping("/{orderId}")
  JsonResult<Order> getOrder(@PathVariable String orderId);

  @GetMapping("/")
  JsonResult addOrder();

}