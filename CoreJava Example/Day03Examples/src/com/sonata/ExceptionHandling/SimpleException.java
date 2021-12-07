package com.sonata.ExceptionHandling;

public class SimpleException {
	public void div() {
		try {
			
		double x=10/5;
		System.out.println("Under try block");
		int a[]	= {1,2,3,45};
		System.out.println(a[5]);
		}catch(ArithmeticException e) {System.out.println(e);}
		catch(Exception e1) {System.out.println(e1);}
		
		finally {
			System.out.println("Finally block");
		}
	}
	public static void main(String arg[]) {
		SimpleException s1=new SimpleException();
		s1.div();
		
	}
}
