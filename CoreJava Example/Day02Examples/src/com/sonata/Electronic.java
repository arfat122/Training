package com.sonata;

public class Electronic extends Product{
	Electronic(int a,String b,double c){
		super(a,b,c);
	}
	Electronic(){}
	public double GST() {
		double extraGST=pPrice*0.2;
		pPrice=pPrice+(pPrice*0.2)+extraGST;
		return pPrice;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electronic e1=new Electronic(123,"Headphone",1000);
		e1.GST();
		e1.Display();
		     

	}

}
