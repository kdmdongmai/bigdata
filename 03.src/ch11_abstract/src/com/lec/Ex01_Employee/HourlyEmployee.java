package com.lec.Ex01_Employee;

public class HourlyEmployee extends Employee {
	private int hoursWorked;
	private int moneyPerHour;
	
	public HourlyEmployee(String name, int hoursWorked, int moneyPerHour) {
		setName(name);
		this.hoursWorked = hoursWorked;
		this.moneyPerHour = moneyPerHour;
	}
	
	public void ComputePay() {
		setSalary(hoursWorked*moneyPerHour);
	}
	
	
}
