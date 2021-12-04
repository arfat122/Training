package com.sonata;

public class CurrentAccount extends BankExample {
	CurrentAccount(int x,String y,double z){
		super(x,y,z);
	}
	public double Return(double x) {
		double total=super.Return(x)+100;
		return total;
		
	}
	public static void main(String arg[]) {
		CurrentAccount c1= new CurrentAccount(123,"xyz",22.2);
		System.out.println(c1.Return(0.1));
		c1.display();
	}

}
