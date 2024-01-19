package com.vin.bankdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

import com.vin.bankdto.BankDTO;
import com.vin.bankdto.AccountDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpSession;




//
public class BankDAO {
	
	String contextPath = "";

	public String getContextPath() {
		return contextPath;
	}

	public void setContextPath(String contextPath) {
		this.contextPath = contextPath;
	}
	

//	public int registerDetails(BankDTO details)throws ClassNotFoundException{
//		String Insert_user_info="INSERT INTO user_info"+
//				"(user_name,user_pass,user_full_name,user_mail,user_ph,user_address)values"+
//				"(?,?,?,?,?,?)";
//	
//		int result=0;
//		
//		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
//			Statement stmt = con.createStatement();
////		ResultSet rs = stmt.executeQuery("select * from user_info");
//			PreparedStatement ps=con.prepareStatement(Insert_user_info);
//			
////			ps.setInt(1,1);
//			ps.setString(1,details.getUname());
//			ps.setString(2,details.getPassword());
//			ps.setString(3,details.getFullName());
//		    ps.setString(4,details.getEmail());
//			ps.setString(5,details.getPhno());
//			ps.setString(6,details.getAddress());
//			
//			System.out.println("the output is :"+ps);
//			result=ps.executeUpdate();
//	
//		}catch(Exception ex) {
//			ex.printStackTrace();
//		}
//		
//		return result;
//	}
	
	
	
	
	public boolean validate( BankDTO userDetails) throws ClassNotFoundException {
	
		boolean status = false;

		Class.forName("com.mysql.jdbc.Driver");

		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/bank","root","root");

				// Step 2:Create a statement using connection object
				PreparedStatement ps = connection.prepareStatement("select * from user_info where user_name=? and user_pass=? ")) {
			ps.setString(1, userDetails.getUname());
			ps.setString(2, userDetails.getPassword());
//			ps.setString(3, userDetails.getFullName());
//			ps.setString(4, userDetails.getEmail());
//			ps.setString(5, userDetails.getPhno());
//			ps.setString(6, userDetails.getAddress());

		

			System.out.println(ps);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
		 System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7));
//			userDetails.setUserId(rs.getInt("user_id"));
//			userDetails.setUname(rs.getString("user_name"));
//			userDetails.setPassword(rs.getString("user_pass"));
//			userDetails.setFullName(rs.getString("user_full_name"));
//			userDetails.setEmail(rs.getString("user_mail"));
//			userDetails.setPhno(rs.getString("user_ph"));
//			userDetails.setAddress(rs.getString("user_address"));
//
			}
//			if (userDetails.getUserId() == 0) {
//				userDetails = null;
//			}

			


	status = rs.next();
		} 
			catch (SQLException e) {
			// process sql exception
			e.printStackTrace(System.err);
		}
	return status;
	
	}
	
	
	
	public BankDTO getUserDetails(String uname) {

		BankDTO resUser = new BankDTO();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from user_info where user_name='" + uname + "'");

			while (rs.next()) {
				// System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
				resUser.setUserId(rs.getInt("user_id"));
				resUser.setUname(rs.getString("user_name"));
				resUser.setPassword(rs.getString("user_pass"));
				resUser.setEmail(rs.getString("user_email"));
				resUser.setPhno(rs.getString("user_ph"));

				resUser.setAddress(rs.getString("user_address"));
				resUser.setFullName(rs.getString("user_full_name"));
			}
			if (resUser.getUserId() == 0) {
				resUser = null;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return resUser;
	}
	
	
//	public List<AccountDTO> getAccountDetails(String uname) {
//
//		List<AccountDTO> resBankAcctList = new ArrayList<AccountDTO>();
//
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_banking", "root", "root");
//			Statement stmt = con.createStatement();
//			ResultSet rs = stmt.executeQuery("select ba.* from bank_accounts ba, user_info u where ba.user_id = u.user_id and u.user_name='"+uname+"'");
//			
//			
//			while (rs.next()) {
//				AccountDTO bankAcctDto = new AccountDTO();
//				
//				bankAcctDto.setId(rs.getInt("id"));
//				bankAcctDto.setAccountNumber(rs.getString("account_number"));
//				bankAcctDto.setAcctType(rs.getString("account_type"));
//				bankAcctDto.setBankName(rs.getString("bank_name"));
//				bankAcctDto.setCurrBalance(rs.getDouble("current_balance"));
//				bankAcctDto.setIfscCode(rs.getString("ifsc_code"));
//				bankAcctDto.setUserId(rs.getInt("user_id"));
//				
//				resBankAcctList.add(bankAcctDto);
//			}
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
//
//		return resBankAcctList;
//	}

	




	
	
	
}