package com.bridgelabz.login.service;

import com.bridgelabz.login.model.Login;
import com.bridgelabz.login.model.User;

public interface UserService {

  void register(User user);

  User validateUser(Login login);
}