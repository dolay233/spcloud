package org.example.service;



import com.exam.pojo.User;
import com.exam.util.JsonResult;
import org.example.service.impl.UserFeignServiceFB;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name="user-service", fallback = UserFeignServiceFB.class)
public interface UserFeignService {
  @GetMapping("/{userId}")
  JsonResult<User> getUser(@PathVariable Integer userId);

  @GetMapping("/{userId}/score")
  JsonResult addScore(@PathVariable Integer userId, @RequestParam Integer score);
}