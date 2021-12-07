package com.sonata.Exception;

public class Salary {
	
	int Salary;

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}
	
	public static void main(String args[]) throws SalaryException {
		Salary s1=new Salary();
		s1.setSalary(50000);
		if(s1.getSalary()<100000)
		{
			System.out.println("Salary Less than 100000");
		}else {
			System.out.println("Salary More than 100000");
		}
		
	}

}
