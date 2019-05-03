package com.bridgelabz.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bridgelabz.login.model.Login;
import com.bridgelabz.login.model.User;
import com.bridgelabz.login.repository.UserDao;

@Service("userService")
public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  @Transactional
  public void register(User user) {
    userDao.register(user);
  }

  @Transactional
  public User validateUser(Login login) {
    return userDao.validateUser(login);
  }

}