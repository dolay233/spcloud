package org.example.service.impl;



import com.exam.pojo.Item;
import com.exam.util.JsonResult;
import java.util.Arrays;
import java.util.List;

import org.example.service.ItemFeignService;
import org.springframework.stereotype.Component;


@Component
public class ItemFeignServiceFB implements ItemFeignService {

  @Override
  public JsonResult<List<Item>> getItems(String orderId) {
    if(Math.random()<0.5) {
      return JsonResult.ok().data(

          Arrays.asList(new Item[] {
              new Item(1,"缓存aaa",2),
              new Item(2,"缓存bbb",1),
              new Item(3,"缓存ccc",3),
              new Item(4,"缓存ddd",1),
              new Item(5,"缓存eee",5)
          })

      );
    }
    return JsonResult.err("无法获取订单商品列表");
  }

  @Override
  public JsonResult decreaseNumber(List<Item> items) {
    return JsonResult.err("无法修改商品库存");
  }

}