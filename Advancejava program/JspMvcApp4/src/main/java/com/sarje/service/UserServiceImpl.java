package com.sarje.service;

import com.sarje.dao.UserDao;
import com.sarje.dao.UserDaoImpl;
import com.sarje.model.User;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	public UserServiceImpl() {
		userDao = new UserDaoImpl(); 
	}

	

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}

	@Override
	public boolean login(User user) {
		
		return userDao.login(user);
	}

	@Override
	public void upload(int uid, String image) {
		// TODO Auto-generated method stub
		userDao.upload(uid, image);
	}
	
	

}
