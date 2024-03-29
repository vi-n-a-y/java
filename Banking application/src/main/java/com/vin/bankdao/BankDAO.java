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
import com.vin.bankdto.TransactionDTO;
//import com.vin.bankdao.JdbcDao;

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
	
//for login credientials	
	
	public BankDTO getUserDetails(String uname) {

		BankDTO resUser = new BankDTO();
		

		try {
			Connection con = JdbcDao.getConnection();
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
			JdbcDao.disconnect(con);
			if (resUser.getUserId() == 0) {
				resUser = null;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return resUser;
	}
	
	
//for registeration
	public int registerDetails(BankDTO details)throws ClassNotFoundException{
		String Insert_user_info="INSERT INTO user_info"+
				"(user_name,user_pass,user_full_name,user_mail,user_ph,user_address)values"+
				"(?,?,?,?,?,?)";
	
		int result=0;
		
		
		try {
			Connection con = JdbcDao.getConnection();
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
			JdbcDao.disconnect(con);
	
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("THE RESULT IS :"+result);
		
		return result;
	}
	


	
	
//to set account details to the database	
	public int setAccDetails(AccountDTO setData)throws ClassNotFoundException{
		String Insert_data="INSERT INTO bank_info" + 
				"(acc_nmbr,bank_name,ifsc_code,acc_type,curr_bal,user_id) values"+
				 "(?,?,?,?,?,?)";
	
		int data=0;
		try {
			Connection con = JdbcDao.getConnection();
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
			JdbcDao.disconnect(con);
	
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return data;
	}
	
	
//send money
//to set details to the database
	
	public int setTransactionDetails(TransactionDTO trxns ) {
//		TransactionDTO trxns = new TransactionDTO();
		String send_money_db ="insert into transaction(from_acc_no,to_acc_no,descr,amount_send,balance,user_id)values"+
		"(?,?,?,?,?,?)";
		int result=0;
		
		try{
			Connection con = JdbcDao.getConnection();
			PreparedStatement ps=con.prepareStatement(send_money_db);
			ps.setString(1,trxns.getFromAcc());
			ps.setString(2,trxns.getToAcc());
			ps.setString(3,trxns.getDescription());
			ps.setDouble(4,trxns.getAmountSend());
			ps.setDouble(5,trxns.getBalance());
			ps.setInt(6,trxns.getUserId());
//			System.out.println("the output is : "+user_id);
			System.out.println("the output is : "+trxns.getFromAcc());
			System.out.println("the output is : "+trxns.getBalance());
			  result=ps.executeUpdate();
			  JdbcDao.disconnect(con);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println(result);
		return result;
	}
	
	//Getting account details from the database	
		public   List<AccountDTO> getAccDetails(int id) {

			List<AccountDTO> accDetList = new ArrayList<AccountDTO>();
			
				String diff_acc_det="select * from bank_info where user_id=" + id;
			try {
				Connection con = JdbcDao.getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(diff_acc_det);
				
				 
				while (rs.next()) {
					
					AccountDTO accDetails = new AccountDTO();
					System.out.println("account number is "+rs.getString("acc_nmbr"));
					accDetails.setId(rs.getInt("id"));	

					accDetails.setAccountNumber(rs.getString("acc_nmbr"));
					accDetails.setBankName(rs.getString("bank_name"));
					accDetails.setIfscCode(rs.getString("ifsc_code"));
					accDetails.setAcctType(rs.getString("acc_type"));
					accDetails.setCurrBalance(rs.getDouble("curr_bal"));
					accDetails.setUserId(rs.getInt("user_id"));
					accDetList.add(accDetails);
				}
				JdbcDao.disconnect(con);
//				if (accDetails.getId()==0) {
//					accDetList = null;
//				}
				
			} catch (Exception ex) {
				ex.printStackTrace();
			}

			return accDetList;
		}
	
	//for miniStatement
	public List<TransactionDTO> setMiniStatement(String acc) {
		List<TransactionDTO> trnDto = new ArrayList<TransactionDTO>();
		String miniStatement ="select * from transaction where from_acc_no="+acc;
		
		
		try{
			Connection con = JdbcDao.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(miniStatement);
			
			while (rs.next()) {
				TransactionDTO accDetails = new TransactionDTO();
				accDetails.setUserId(rs.getInt("user_id"));	
				accDetails.setTrnDate(rs.getDate("trxn_date"));
				accDetails.setTrnId(rs.getInt("trxn_id"));
				accDetails.setFromAcc(rs.getString("from_acc_no"));
				accDetails.setToAcc(rs.getString("to_acc_no"));
				accDetails.setDescription(rs.getString("descr"));
				accDetails.setBalance(rs.getDouble("balance"));
				accDetails.setAmountSend(rs.getDouble("amount_send"));
				trnDto.add(accDetails);
				
			}
			JdbcDao.disconnect(con);
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return trnDto;
	}
	
	public double updateCurrBal(double amt,int id) {
		String update_curr_bal="update bank_info set curr_bal="+amt+" where user_id="+id;
		try {
			Connection con = JdbcDao.getConnection();
			PreparedStatement ps=con.prepareStatement(update_curr_bal);
			ps.executeUpdate();
			JdbcDao.disconnect(con);
		}catch(Exception ex) {
			ex.printStackTrace();
		}		
		return amt;
	}
	
	public double updateCurrBalToRec(double amt,String to_acc_nmbr) {
		String update_rec_bal="update bank_info set curr_bal=curr_bal+"+amt+" where acc_nmbr="+to_acc_nmbr;

		try {
			Connection con = JdbcDao.getConnection();
			PreparedStatement ps=con.prepareStatement(update_rec_bal);
			ps.executeUpdate();
			JdbcDao.disconnect(con);
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
		
		
		return amt;
	}
	
	
	
	
	
}
