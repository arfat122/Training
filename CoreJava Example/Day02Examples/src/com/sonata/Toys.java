package com.sonata;

public class Toys extends Product{
	Toys(int a,String b,double c){
		super(a,b,c);
	}
	Toys(){}
	public double GST() {
		double extraGST=pPrice*0.1;
		pPrice=pPrice+(pPrice*0.2)+extraGST;
		return pPrice;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toys t1=new Toys(121,"Ball",10);
		t1.GST();
		t1.Display();
		     

	}

}
