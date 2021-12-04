package com.sonata;

public class Tshirt {
	String colour;
	String material;
	String design;
	String size;
	Tshirt(String a,String b,String c,String d){
		this.colour=a;
		this.material=b;
		this.design=c;
		this.size=d;
	}
	Tshirt(){}
	public void Display() {
		System.out.print(colour+" ");
		System.out.print(material+" ");
		System.out.print(design+" ");
		System.out.println(size);
		
	}
	public static void main(String arg[]) {
		Tshirt small=new Tshirt("Red","Cotton","Indian","small");
		Tshirt large=new Tshirt("Blue","Denim","Western","large");
		Tshirt xtralarge=new Tshirt("Yellow","Lenin","Cut-piece","xtralarge");
		small.Display();
		System.out.println();
		large.Display();
		System.out.println();
		xtralarge.Display();
		
	}

}
