package org.exam.service;

import org.exam.pojo.Order;

public interface OrderService {
  Order getOrder(String orderId);
  void addOrder(Order order);
}
