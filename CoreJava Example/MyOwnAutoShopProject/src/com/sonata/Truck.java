package com.sonata;

public class Truck extends Car {
	int weight;
	Truck(int a,double b,String c,int d)
	{
		super(a,b,c);
		this.weight=d;
	}
	
	double getSalePrice() {
		double totalPrice;
		if (weight>2000) {
		double discount=regularPrice*0.1;
		totalPrice=super.getSalePrice()-discount;
		}
		else{
			double dis=regularPrice*0.2;
			totalPrice=super.getSalePrice() - dis;
		}
		return totalPrice;
	}
}
