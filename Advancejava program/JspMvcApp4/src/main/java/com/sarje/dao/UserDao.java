package com.sarje.dao;

import com.sarje.model.User;

public interface UserDao {
	void save (User user);
	boolean login(User user);
	void upload(int uid,String image);

}
