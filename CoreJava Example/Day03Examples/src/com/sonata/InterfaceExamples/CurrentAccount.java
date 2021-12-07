package com.sonata.InterfaceExamples;

import com.sonata.JavaBean.Bank;
import com.sonata.ExceptionHandling.MyOwnException;

public class CurrentAccount extends com.sonata.JavaBean.Bank implements BankInterface{
	



	@Override
	public double WithDraw(double amt) {
		double x=super.getBalance()-amt;
		return x;
	}

	@Override
	public double Deposit(double amt) {
		double x =super.getBalance()+amt;
		return x;
	}
	public static void main(String[] args) throws MyOwnException {
		// TODO Auto-generated method stub
		CurrentAccount c1=new CurrentAccount();
		c1.setAccName("Arfat");
		c1.setAccNo(123);
		c1.setBalance(0);
		if(c1.getBalance()==0) {
			throw new MyOwnException("Cannot withdraw Full amount");
			
		}else
		{
			System.out.println(c1.WithDraw(500));
		}
		System.out.println(c1);
	}
	
}



