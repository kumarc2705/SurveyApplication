package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserDAO;
import com.example.model.User;
@Service
public class UserServiceImpl implements UserService{
@Autowired
UserDAO userDAO;
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userDAO.save(user);
	}

	@Override
	public User getUserByName(String name) {
		// TODO Auto-generated method stub
		User user=userDAO.findUserByName(name);
		return user;
	}

}
