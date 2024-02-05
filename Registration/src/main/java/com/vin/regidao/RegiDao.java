package com.vin.regidao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.vin.regidto.RegiDto;

public class RegiDao {
	public int insertRegiDet(RegiDto dto) {
		int result=0;
	
		String inst="insert into user_regi(user_name,first_name,last_name,phone_number,email) values (?,?,?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
			PreparedStatement ps=con.prepareStatement(inst);
			
			ps.setString(1,dto.getUser_name());
			ps.setString(2,dto.getFirst_name());
			ps.setString(3,dto.getLast_name());
			ps.setString(4,dto.getPhone_number());
		    ps.setString(5,dto.getEmail());
			
		    result=ps.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	

}
