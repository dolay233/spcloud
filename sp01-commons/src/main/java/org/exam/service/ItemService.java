package org.exam.service;

import java.util.List;
import org.exam.pojo.Item;

public interface ItemService {
  List<Item> getItems(String orderId);
  void decreaseNumbers(List<Item> list);
}
