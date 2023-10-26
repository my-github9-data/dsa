// Create array of employees and search employee by 
//	i. empid
//	ii. name
//	iii. salary
package com.sunbeam;

import java.util.Objects;

public class Employees {
	private int empid;
	private String name;
	private double salary;
	public Employees() {
	}
	public Employees(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employees [Empid=" + empid + ", Name=" + name + ", Salary=" + salary + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employees other = (Employees) obj;
		return Objects.equals(name, other.name);
	}
	
}
