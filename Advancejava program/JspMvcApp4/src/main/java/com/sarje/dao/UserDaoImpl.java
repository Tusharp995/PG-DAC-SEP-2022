package com.sarje.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sarje.conn.MyConn;
import com.sarje.model.User;

public class UserDaoImpl implements UserDao {
			
	private MyConn myConn;
	
	public UserDaoImpl() {
		myConn =new MyConn();
		}
	
	
	
	@Override
	public void save(User user) {
	try {
		Connection con = myConn.getConn();
		PreparedStatement s = con.prepareStatement("insert into User(uname,upass) values(?,?)");
		s.setString(1, user.getUname());
		s.setString(2, user.getUpass());
		int i = s.executeUpdate();
		s.close();
		con.close();
				
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}



	@Override
	public boolean login(User user) {
		boolean flag = false;
		
		try {
			Connection con = myConn.getConn();
			PreparedStatement s = con.prepareStatement("select * from User where uname = ? and upass = ?");
			s.setString(1, user.getUname());
			s.setString(2, user.getUpass()); 
			ResultSet rs = s.executeQuery();
			if(rs.next()) {
				flag = true;
			}
			s.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}  
		
		return flag;
		
	}



	@Override
	public void upload(int uid, String image) {
		try {
			Connection con = myConn.getConn();
			PreparedStatement s = con.prepareStatement("update user set image = ? where uid = ?");
			s.setString(1, image);
			s.setInt(2,uid);
			int i = s.executeUpdate();
			s.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
