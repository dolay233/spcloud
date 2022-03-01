package com.exam.service.impl;


import com.exam.pojo.User;
import com.exam.service.UserFeignService;
import com.exam.util.JsonResult;
import org.springframework.stereotype.Component;

@Component
public class UserFeignServiceFB implements UserFeignService {

  @Override
  public JsonResult<User> getUser(Integer userId) {
    return JsonResult.err("无法获取用户信息");
  }

  @Override
  public JsonResult addScore(Integer userId, Integer score) {
    return JsonResult.err("无法增加用户积分");
  }

}