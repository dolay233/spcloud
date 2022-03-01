package com.exam.service;

import com.exam.pojo.Order;

public interface OrderService {
  Order getOrder(String orderId);
  void addOrder(Order order);
}
