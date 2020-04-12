package com.junjie.scorer.server.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.junjie.scorer.core.dao.UserDAO;
import com.junjie.scorer.core.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangjunjie@sensorsdata.cn
 * @since 2020/4/12 2:47 AM
 */
@RestController
public class TestController {

  @Autowired
  private UserDAO userDAO;

  private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

  @GetMapping("/test")
  public String test() throws JsonProcessingException {
    /*User user =
        User.builder().account("test").password("123456").email("test@test.com").name("test").telephone("test").build();
    userDAO.save(user);*/
    User user = userDAO.findById(1);
    return OBJECT_MAPPER.writeValueAsString(user);
  }
}
