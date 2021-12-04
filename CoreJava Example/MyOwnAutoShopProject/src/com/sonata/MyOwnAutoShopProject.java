package com.sonata;

public class MyOwnAutoShopProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan s1=new Sedan(80,150000,"Red",25);
		
		Ford f1=new Ford(75,120000,"Yellow",10000);
		Ford f2=new Ford(90,200000,"White",12000);
		Car c1=new Car(120,250000,"Black");
		Truck t1=new Truck(100,110000,"White",1000);
		System.out.println("Sale price of Truck: "+t1.getSalePrice()+"Rs");
		System.out.println("Sale price of Sedan:"+s1.getSalePrice()+"Rs");
		System.out.println("Sale price of Ford f1: "+f1.getSalePrice()+"Rs");
		System.out.println("Sale price of Ford f2: "+f2.getSalePrice()+"Rs");
		System.out.println("Sale price of Car: "+c1.getSalePrice()+"Rs");

	}

}
