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
		System.out.println("THE RESULT IS :"+result);
		
		return result;
	}
	
	public BankDTO getUserDetails(String uname) {

		BankDTO resUser = new BankDTO();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from user_info where user_name='" + uname + "'");

			while (rs.next()) {
		
				resUser.setUserId(rs.getInt("user_id"));
				resUser.setUname(rs.getString("user_name"));
				resUser.setPassword(rs.getString("user_pass"));
				resUser.setEmail(rs.getString("user_mail"));
				resUser.setPhno(rs.getString("user_ph"));
				resUser.setAddress(rs.getString("user_address"));
				resUser.setFullName(rs.getString("user_full_name"));
//				System.out.println(rs.getString(4));
			}
			if (resUser.getUserId() == 0) {
				resUser = null;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return resUser;
	}
	
	
	public AccountDTO getAccDetails(int id) {

		AccountDTO accDetails = new AccountDTO();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from bank_info where user_id=" + id );

			while (rs.next()) {
				 System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
//				accDetails.setId(rs.getInt("id"));
				accDetails.setAccountNumber(rs.getString("acc_nmbr"));
				accDetails.setBankName(rs.getString("bank_name"));
				accDetails.setIfscCode(rs.getString("ifsc_code"));
				accDetails.setAcctType(rs.getString("acc_type"));
				accDetails.setCurrBalance(rs.getDouble("curr_bal"));
				accDetails.setUserId(rs.getInt("user_id"));
			}
			if (accDetails.getUserId() == 0) {
				accDetails = null;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return accDetails;
	}
	public int setAccDetails(AccountDTO setData)throws ClassNotFoundException{
		String Insert_data="INSERT INTO bank_info" + 
				"(acc_nmbr,bank_name,ifsc_code,acc_type,curr_bal,user_id) values"+
				 "(?,?,?,?,?,?)";
	
		int data=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
			Statement stmt = con.createStatement();
//		ResultSet rs = stmt.executeQuery("select * from user_info");
			PreparedStatement ps=con.prepareStatement(Insert_data);
			
//			ps.setInt(1,1);
			ps.setString(1,setData.getAccountNumber());
			ps.setString(2,setData.getBankName());
			ps.setString(3,setData.getIfscCode());
		    ps.setString(4,setData.getAcctType());
			ps.setDouble(5,setData.getCurrBalance());
			ps.setInt(6,setData.getUserId());
			
			System.out.println("the output is :"+ps);
			data=ps.executeUpdate();
	
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return data;
	}
	
}