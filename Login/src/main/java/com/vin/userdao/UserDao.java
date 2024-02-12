package com.vin.userdao;

import com.vin.userdto.UserDto;
import com.vin.util.HibernateUtil;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class UserDao {

	@SuppressWarnings("unchecked")
	public UserDto getUserDetails(String uname) {
//		UserDto dto = new UserDto();
//
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
//
//			Statement stmt = con.createStatement();
//			ResultSet rs = stmt.executeQuery("select * from ass1 where user_name='" + uname + "'");
//
//			while (rs.next()) {
//				dto.setId(rs.getInt("id"));
//				dto.setUsername(rs.getString("user_name"));
//				dto.setPassword(rs.getString("user_pass"));
//				System.out.println(rs.getString(1));
//			}
//			if (dto.getId() == 0) {
//				dto = null;
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return dto;
		Transaction transaction=null;
		UserDto dto=null;
		try(Session session =HibernateUtil.getSessionFactory().openSession()){
			transaction =session.beginTransaction();
			dto=(UserDto) session.createQuery("from UserDto").getResultList();
			transaction.commit();
			System.out.println("method is called");
			
		}catch(Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return dto;
	}
	
	public void saveUser(UserDto user) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(user);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

}
