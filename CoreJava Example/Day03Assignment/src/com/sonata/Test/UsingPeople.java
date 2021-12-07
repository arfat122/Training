package com.sonata.Test;
import com.sonata.JavaBean.Employe;
import com.sonata.StaffMember;
import com.sonata.TechnicalEmploye;
import com.sonata.Interface.EmployeInterfae;
public class UsingPeople extends Employe implements EmployeInterfae{
		
	public static void main(String args[]) {
		TechnicalEmploye t1=new TechnicalEmploye();
		StaffMember s1=new StaffMember();
		t1.setEmployeeID(21260);
		t1.setEmpName("ARFAT");
		System.out.println(t1);
		System.out.println("Salary of Technical Emloyee t1: "+t1.CalculateSalary());
		s1.setEmployeeID(210021);
		s1.setEmpName("JAYA");
		System.out.println(s1);
		System.out.println("Salary of Staff Member s1: "+ s1.CalculateSalary());
	}
}
