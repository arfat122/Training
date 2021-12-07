package com.sonata.AnnotatioExample;

@FunctionalInterface
interface Xyz
{
	void Display();
}

class Emp1 implements Xyz{
	public void myData() {
		System.out.println("myData Method");
	}
	@Override
	public void Display() {
		System.out.println("Show this One");
	}
}

class EmpShow extends Emp1{
	@Override()
	public void myData() {
		System.out.println("myData Call method");
	}
}

public class AnnotationExample {
	public static void main(String arg[]) {
		EmpShow obj=new EmpShow();
		obj.myData();
	}

}
