package com.lec.Ex01_Employee;

public class SalaryEmployee extends Employee {

	private int annualSalary;
	
	public SalaryEmployee(String name, int annualSalary) {
		setName(name);
		this.annualSalary = annualSalary;
	}
	
	@Override
	public void ComputePay() {
		setSalary(annualSalary/14);
	}

	public String salaryInfo() {
		return ""; 
	}

}
