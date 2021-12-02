package com.sonata;

public class Duplicate {
	public static void main(String args[])
	{
		int a[]= {1,2,3,3,5,5};
		System.out.println("Duplicate values are:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}
	}

}
