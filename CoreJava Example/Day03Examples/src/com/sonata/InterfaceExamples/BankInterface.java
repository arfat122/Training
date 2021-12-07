package com.sonata.InterfaceExamples;

public interface BankInterface {
	
	public double WithDraw(double amt);
	public double Deposit(double amt);
	
	default void NewMethod() {
		System.out.println("This new default Method");
		gen();	
	}
	default void myMethod() {
		System.out.println("Newly added default Method");
		gen();
	}
	private void gen() {
		System.out.println("Private Method");
	}
	static void anotherNewMethod() {
		System.out.println("Newly added static method");
	}
}
