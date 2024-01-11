package com.vin.BankDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.vin.BankDTO.BankDTO;


//
public class BankDAO {

	public int registerEmployee(BankDTO employee)throws ClassNotFoundException{
		String Insert_user_info="INSERT INTO user_info"+
				"(userId,uname,password,fullName,email,phno,address)values"+
				"(?,?,?,?,?,?,?)";
	
		int result=0;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
			Statement stmt = con.createStatement();
//		ResultSet rs = stmt.executeQuery("select * from user_info");
			PreparedStatement ps=con.prepareStatement(Insert_user_info);
			
			ps.setInt(1,employee.getUserId());
			ps.setString(1,employee.getUname());
			ps.setString(1,employee.getPassword());
			ps.setString(1,employee.getFullName());
		    ps.setString(1,employee.getEmail());
			ps.setString(1,employee.getPhno());
			ps.setString(1,employee.getAddress());
			
			
			result=ps.executeUpdate();
	
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return result;
	}
	
	
}
