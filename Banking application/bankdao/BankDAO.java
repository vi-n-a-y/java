package com.vin.bankdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

import com.vin.bankdto.BankDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpSession;


//
public class BankDAO {

	public int registerDetails(BankDTO details)throws ClassNotFoundException{
		String Insert_user_info="INSERT INTO user_info"+
				"(user_name,user_pass,user_full_name,user_mail,user_ph,user_address)values"+
				"(?,?,?,?,?,?)";
	
		int result=0;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
			Statement stmt = con.createStatement();
//		ResultSet rs = stmt.executeQuery("select * from user_info");
			PreparedStatement ps=con.prepareStatement(Insert_user_info);
			
//			ps.setInt(1,1);
			ps.setString(1,details.getUname());
			ps.setString(2,details.getPassword());
			ps.setString(3,details.getFullName());
		    ps.setString(4,details.getEmail());
			ps.setString(5,details.getPhno());
			ps.setString(6,details.getAddress());
			
			System.out.println("the output is :"+ps);
			result=ps.executeUpdate();
	
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return result;
	}
	
	
	
	
	public boolean validate( BankDTO userDetails) throws ClassNotFoundException {
		boolean status = false;

		Class.forName("com.mysql.jdbc.Driver");

		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/bank","root","root");

				// Step 2:Create a statement using connection object
				PreparedStatement ps = connection.prepareStatement("select * from user_info where user_name=? and user_pass=? ")) {
			ps.setString(1, userDetails.getUname());
			ps.setString(2, userDetails.getPassword());
			

			System.out.println(ps);
			ResultSet rs = ps.executeQuery();
//				if(rs.next()){
//					   System.out.println(rs.getString(1));
//					   System.out.println(rs.getString(2));
//					   System.out.println(rs.getString(3));
//					   System.out.println(rs.getString(4));
//					   System.out.println(rs.getString(5));
//					
//			}


			status = rs.next();

		} catch (SQLException e) {
			// process sql exception
			e.printStackTrace(System.err);
		}
		return status;
	}

	




	
	
	
}