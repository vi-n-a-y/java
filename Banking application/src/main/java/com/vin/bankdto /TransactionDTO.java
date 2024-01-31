package com.vin.bankdto;

import java.sql.Date;

public class TransactionDTO {
	private Date trnDate;
	private int trnId;

	private String fromAcc;
	private String toAcc;
	private String description;
	private double amountSend;
	private double balance;
	private int userId;
	public Date getTrnDate() {
		return trnDate;
	}
	public void setTrnDate(Date trnDate) {
		this.trnDate = trnDate;
	}
	public int getTrnId() {
		return trnId;
	}
	public void setTrnId(int trnId) {
		this.trnId = trnId;
	}
	
	public String getFromAcc() {
		return fromAcc;
	}
	public void setFromAcc(String fromAcc) {
		this.fromAcc = fromAcc;
	}
	public String getToAcc() {
		return toAcc;
	}
	public void setToAcc(String toAcc) {
		this.toAcc = toAcc;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getAmountSend() {
		return amountSend;
	}
	public void setAmountSend(double amountSend) {
		this.amountSend = amountSend;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

}
