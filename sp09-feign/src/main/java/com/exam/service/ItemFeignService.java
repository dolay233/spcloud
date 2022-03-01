package com.exam.service;

import com.exam.pojo.Item;
import com.exam.service.impl.ItemFeignServiceFB;
import com.exam.util.JsonResult;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "item-service", fallback = ItemFeignServiceFB.class)
public interface ItemFeignService {
  @GetMapping("/{orderId}")
  JsonResult<List<Item>> getItems(@PathVariable String orderId);

  @PostMapping("/decreaseNumber")
  JsonResult decreaseNumber(@RequestBody List<Item> items);
}
