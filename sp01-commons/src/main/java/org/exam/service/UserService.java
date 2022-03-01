package org.exam.service;

import org.exam.pojo.User;

public interface UserService {
  User getUser(Integer id);
  void addScore(Integer id, Integer score);
}
