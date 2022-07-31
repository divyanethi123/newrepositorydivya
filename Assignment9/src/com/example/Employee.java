package com.example;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
	String name;
	Date date;
	String department;
	String designation;
	double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee() {		
	}
	public Employee(String name, Date date, String department, String designation, double salary) {
		this.name = name;
		this.date = date;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}
}
