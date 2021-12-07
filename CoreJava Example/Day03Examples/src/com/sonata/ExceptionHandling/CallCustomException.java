package com.sonata.ExceptionHandling;

public class CallCustomException {
	public static void main(String[] arg) throws MyOwnException {
		int age=15;
		if(age<18) {
			throw new MyOwnException("age is less tha 18");
			
		}else {
			System.out.println("Welcome to Vote");
		}
		 
	}

}
