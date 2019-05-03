package com.bridgelabz.login.repository;

import com.bridgelabz.login.model.Login;
import com.bridgelabz.login.model.User;

public interface UserDao {

  void register(User user);

  User validateUser(Login login);

}