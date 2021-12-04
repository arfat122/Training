package com.sonata;

public class Student {
	int stdID;
	String stdName;
	int stdMarks;
	
	Student(int a,String name,int Marks){
		this.stdID=a;
		this.stdName=name;
		this.stdMarks=Marks;
	}
	Student(){}
	
	public void Display(){
		System.out.println(stdID);
		System.out.println(stdName);
		System.out.println(stdMarks);
		
	}
	public static void main(String arg[]) {
		Student s1=new Student(1,"Arfat",95);
		s1.Display();
		Student s2=new Student();
		s2.stdID=111;
		s2.stdName="xyz";
		s2.stdMarks=82;
		s2.Display();
		
	}

}
