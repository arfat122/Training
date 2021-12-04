package com.sonata;

public class Car {
	int speed;
	double regularPrice;
	String colour;
	Car(int a,double b,String c){
		this.speed=a;
		this.regularPrice=b;
		this.colour=c;
	}
	Car(){}
	
	double getSalePrice(){
		double gst=regularPrice*0.2;
		double totalPrice=regularPrice+gst;
		return totalPrice;
		
	}
}
