package com.exam.service;


import com.exam.pojo.Order;
import com.exam.util.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient("order-service")
public interface OrderFeignService {
  @GetMapping("/{orderId}")
  JsonResult<Order> getOrder(@PathVariable String orderId);

  @GetMapping("/")
  JsonResult addOrder();

}