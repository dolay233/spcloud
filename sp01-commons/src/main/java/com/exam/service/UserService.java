package com.exam.service;

import com.exam.pojo.User;

public interface UserService {
  User getUser(Integer id);
  void addScore(Integer id, Integer score);
}
