package com.exam.service.impl;



import com.exam.pojo.Order;
import com.exam.service.OrderFeignService;
import com.exam.util.JsonResult;
import org.springframework.stereotype.Component;

@Component
public class OrderFeignServiceFB implements OrderFeignService {

  @Override
  public JsonResult<Order> getOrder(String orderId) {
    return JsonResult.err("无法获取商品订单");
  }

  @Override
  public JsonResult addOrder() {
    return JsonResult.err("无法保存订单");
  }

}