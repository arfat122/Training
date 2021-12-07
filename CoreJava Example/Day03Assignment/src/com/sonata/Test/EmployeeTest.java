package com.sonata.Test;

import com.sonata.Developer;
import com.sonata.Manager;
import com.sonata.Tester;
import com.sonata.Interface.EmployeeInterface;
import com.sonata.JavaBean.Employee;

public class EmployeeTest extends Employee implements EmployeeInterface{
	public static void main(String[] args) {
		Developer d1=new Developer();
		Manager m1=new Manager();
		Tester t1=new Tester();
		d1.setEmpID(456);
		d1.setEmpName("XYZ");
		d1.setEmpSal(40000);
		m1.setEmpID(123);
		m1.setEmpName("ABC");
		m1.setEmpSal(5000000);
		t1.setEmpID(765);
		t1.setEmpName("PQR");
		t1.setEmpSal(49999);
		System.out.println(d1);
		System.out.println(m1);
		System.out.println(t1);
	}

}
