package com.sonata.JavaBean;

public class Bank {
	private int accNo;
	private String accName;
	private double Balance;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	@Override
	public String toString() {
		return "Bank [accNo=" + accNo + ", accName=" + accName + ", Balance=" + Balance + "]";
	}

	

}
