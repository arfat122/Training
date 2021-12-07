package com.sonata;
import com.sonata.JavaBean.Employe;
import com.sonata.Interface.EmployeInterfae;

public class StaffMember extends Employe implements EmployeInterfae {
	String title;
	@Override
	public double CalculateSalary() {
		super.setNoofleaves(3);
		double leave=super.getNoofleaves()*400;
		super.setBasicpay(10000);
		double HRA=super.getBasicpay()*0.18;
		double salary=super.getBasicpay()+HRA-leave;
		return salary;
	}
	

}
