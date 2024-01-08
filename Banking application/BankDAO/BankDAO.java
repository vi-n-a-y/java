package com.vin.BankDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.vin.BankDTO.BankDTO;



public class BankDAO {
	public BankDTO getUserDetails(String uname) {
		
		BankDTO resUser = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_details","root","root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from user_info");
			
			while(rs.next())  {
				System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			}
				  

		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return resUser;
	}
}
