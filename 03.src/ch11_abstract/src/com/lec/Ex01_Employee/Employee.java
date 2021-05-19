package com.lec.Ex01_Employee;

public abstract class Employee {
	private String name;
	private int salary;
	private double incentive;
	public Employee() {
	}
	public abstract void ComputePay(); 
	
	public void ComputeIncentive() {
		if(salary>=3000000) {
			incentive = salary*1.1;
			
		} else {
			incentive = 0;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getIncentive() {
		return incentive;
	}
	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	
	
}
