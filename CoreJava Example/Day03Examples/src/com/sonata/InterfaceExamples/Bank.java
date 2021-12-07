package com.sonata.InterfaceExamples;

public class Bank {
	int AccNo;
	String AccName;
	double Balance;
	
	public Bank() {}
	public Bank(int accID,String accName,double balance)
	{
		this.AccNo=accID;
		this.AccName=accName;
		this.Balance=balance;
	}
	void Display() {
		System.out.println(this.AccNo);
		System.out.println(this.AccName);
		System.out.println(this.Balance);
	}

}
