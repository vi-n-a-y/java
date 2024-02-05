package com.vin.userdao;

import com.vin.userdto.UserDto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDao {

	public UserDto getUserDetails(String uname) {
		UserDto dto = new UserDto();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from ass1 where user_name='" + uname + "'");

			while (rs.next()) {
				dto.setId(rs.getInt("id"));
				dto.setUsername(rs.getString("user_name"));
				dto.setPassword(rs.getString("user_pass"));
				System.out.println(rs.getString(1));
			}
			if (dto.getId() == 0) {
				dto = null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}

}
