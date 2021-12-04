package com.sonata;




public class BankExample {
	int accNo;
	String accName;
	double accBal;
	BankExample(int n,String name,double b){
		this.accNo=n;
		this.accName=name;
		this.accBal=b;
	}
	BankExample(){}
	
	public double Return(double x) {
		accBal=accBal+(accBal*x);
		return accBal;
		
	}
	
	
	public void deposit(){
		System.out.println("This is deposit");
		
	}
	public void withDraw() {
		System.out.println("This is withdraw");
	}
	
	public void display() {
		System.out.println(accNo);
		System.out.println(accName);
		System.out.println(accBal);
	}
	
	public static void main(String arg[]) {
		BankExample b1=new BankExample();
		b1.accNo=123;
		b1.accName="ABC";
		b1.accBal=22.2;
		b1.Return(0.1);
		b1.display();
	}
	
	

}

