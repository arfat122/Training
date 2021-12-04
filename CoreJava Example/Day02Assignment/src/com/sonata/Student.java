package com.sonata;

public class Student {
	int stdID;
	String stdName;
	int stdClass;
	Student(int a,String b,int c){
		this.stdID=a;
		this.stdName=b;
		this.stdClass=c;
	}
	Student(){}
	
	public void Display() {
		System.out.print(stdID+" ");
		System.out.print(stdName+" ");
		System.out.print(stdClass);

	}
	public static void main(String arg[]) {
		Student s1=new Student(1,"Arfat",8);
		Student s2=new Student(2,"Shaikh",9);
		s1.Display();
		System.out.println();
		s2.Display();
		
	}
}
