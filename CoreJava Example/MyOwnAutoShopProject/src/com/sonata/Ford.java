package com.sonata;

public class Ford extends Car{
	int year;
	double manufacturerDiscount;
	Ford(int a,double b,String c,int d)
	{
		super(a,b,c);
		this.manufacturerDiscount=d;
	}
	double getSalePrice() {
		double totalPrice=super.getSalePrice()-manufacturerDiscount;
		return totalPrice;
		
		
	}

}
