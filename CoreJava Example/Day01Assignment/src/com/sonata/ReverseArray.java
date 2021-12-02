package com.sonata;

public class ReverseArray {
	public static void main(String args[]) {
		
	
	int a[]= {1,2,3,4,5,6};
	for(int i=0;i<=5;i++)
	{
		System.out.print(a[i] +" ");
		
	}
	System.out.println();
	System.out.println("Reversed Array:");
	
	for(int i=5;i>=0;i--)
	{
		System.out.print(a[i] +" ");
		
	}
}
}