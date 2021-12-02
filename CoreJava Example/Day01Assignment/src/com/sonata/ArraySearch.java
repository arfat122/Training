package com.sonata;

public class ArraySearch {
	public static void main(String args[]) {
		int a[]= {1,2,3,4,5,6};
		int b=3;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b)
			{
				System.out.println("Element Found at pos:" +i);
			}
			
		}
	}
}
