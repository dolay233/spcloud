package org.exam.service;


import com.fasterxml.jackson.core.type.TypeReference;
import java.util.List;

import org.exam.pojo.User;
import org.exam.util.JsonUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;



import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
  @Value("${sp.user-service.users}")
  private String userJson;

  @Override
  public User getUser(Integer id) {
    log.info("users json string : "+userJson);
    List<User> list = JsonUtil.from(userJson, new TypeReference<List<User>>() {});
    for (User u : list) {
      if (u.getId().equals(id)) {
        return u;
      }
    }

    return new User(id, "name-"+id, "pwd-"+id);
  }

  @Override
  public void addScore(Integer id, Integer score) {
    // 这里增加积分
    log.info("user "+id+" - 增加积分 "+score);
  }

}