package com.sonata;

public class Product {
	int proID;
	String proName;
	double proPrice;
	
	Product(int a,String b,double c){
		this.proID=a;
		this.proName=b;
		this.proPrice=c;
	}
	Product(){}
	public void total() {
		double gst=proPrice*0.2;
		proPrice=proPrice+gst;
		System.out.println("GST:"+gst+"Rs");
	}
	public void Display() {
		System.out.print(proID+" ");
		System.out.print(proName+" ");
		System.out.print(proPrice);

	}
	public static void main(String args[]){
		Product p1=new Product(001,"Toy",100);
		p1.total();
		p1.Display();
		
	}
}
