package com.sonata;

import com.sonata.JavaBean.Employe;
import com.sonata.Interface.EmployeInterfae;
public class TechnicalEmploye extends Employe implements EmployeInterfae{
	String skills;
	
	@Override
	public double CalculateSalary() {
		// TODO Auto-generated method stub
		super.setNoofleaves(3);
		double leave=super.getNoofleaves()*600;
		super.setBasicpay(17000);
		double HRA=super.getBasicpay()*0.12;
		double salary=super.getBasicpay()+HRA-leave;
		return salary;
	}

}
