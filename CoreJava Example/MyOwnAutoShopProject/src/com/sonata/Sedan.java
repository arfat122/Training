package com.sonata;

public class Sedan extends Car{
	int length;
	Sedan(int a,double b,String c,int d)
	{
		super(a,b,c);
		this.length=d;
	}
	
	double getSalePrice() {
		double totalPrice;
		if (length>20) {
		double discount=regularPrice*0.05;
		totalPrice=super.getSalePrice()-discount;
		}
		else{
			double dis=regularPrice*0.1;
			totalPrice=super.getSalePrice() - dis;
		}
		return totalPrice;
	}

}
