package com.sonata.PacExample;

public class PackageExample {
	private int add(int a,int b) {
		return a+b;
	}
	int sub(int a, int b) {
		return a-b;
	}
	protected int mul(int a,int b) {
		return a*b;
	}
	public int div(int a,int b) {
		return a/b;
	}
	public static void main(String arg[]) {
		PackageExample p1=new PackageExample();
		System.out.println(p1.add(10,20));
		System.out.println(p1.sub(20, 10));
		System.out.println(p1.mul(2, 3));
		System.out.println(p1.div(20, 10));
		
	}
}
