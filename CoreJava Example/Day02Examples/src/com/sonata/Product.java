package com.sonata;

public class Product {
	int pID;
	String pName;
	double pPrice;
	Product(int a,String b,double c){
		this.pID=a;
		this.pName=b;
		this.pPrice=c;
	}
	Product(){}
	public double GST() {
		pPrice=pPrice+(pPrice*0.2);
		return pPrice;
		
	}
	
	public void Display() {
		System.out.println(pID);
		System.out.println(pName);
		System.out.println(pPrice);
	}
	
	public static void main(String arg[]) {
		Product p1=new Product(001,"X",30);
		p1.GST();
		p1.Display();
	}
}
