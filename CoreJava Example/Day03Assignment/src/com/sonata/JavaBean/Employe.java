package com.sonata.JavaBean;

public class Employe{
	private int employeeID;
	private String  empName;
	private String Address;
	private double basicpay;
	private int noofleaves;
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress() {
		Address = Address;
	}
	public double getBasicpay() {
		return basicpay;
	}
	public void setBasicpay(double basicpay) {
		this.basicpay = basicpay;
	}
	public int getNoofleaves() {
		return noofleaves;
	}
	public void setNoofleaves(int noofleaves) {
		this.noofleaves = noofleaves;
	}
	public String toString() {
		return "Employe [employeeID=" + employeeID + ", empName=" + empName + "]";
	}
	
	

}
