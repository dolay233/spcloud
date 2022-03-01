package com.exam.service;

import java.util.List;
import com.exam.pojo.Item;

public interface ItemService {
  List<Item> getItems(String orderId);
  void decreaseNumbers(List<Item> list);
}
