package com.sonata.InterfaceExamples;

public class SavingAccount extends Bank implements BankInterface{
	
	public double WithDraw(double amt) {
		double x=super.Balance-amt;
		return x;
	}
	public double Deposit(double amt) {
		double x=super.Balance+amt;
		return x;
	}
	

	public static void main(String[] args) {
		
		SavingAccount s1=new SavingAccount();
		s1.Deposit(1000);
		s1.NewMethod();
		
			
		
	}
	

}
