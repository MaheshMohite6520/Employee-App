package com.employee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Employee 
{
	private int employeeId;
	private String ename;
	private String dept;
	private String email;
	private long contact;
	private double salary;
	private String address;
	private String designation;

	public int getEmployeeId() 
	{
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) 
	{
		this.employeeId = employeeId;
	}
	
	public String getEname() 
	{
		return ename;
	}
	
	public void setEname(String ename) 
	{
		this.ename = ename;
	}
	
	public String getDept() 
	{
		return dept;
	}
	
	public void setDept(String dept) 
	{
		this.dept = dept;
	}
	
	public String getEmail() 
	{
		return email;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public long getContact() 
	{
		return contact;
	}
	
	public void setContact(long contact) 
	{
		this.contact = contact;
	}
	
	public double getSalary() 
	{
		return salary;
	}
	
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	
	public String getAddress() 
	{
		return address;
	}
	
	public void setAddress(String address) 
	{
		this.address = address;
	}
	
	public String getDesignation() 
	{
		return designation;
	}
	
	public void setDesignation(String designation) 
	{
		this.designation = designation;
	}
	
	@Override
	public String toString() 
	{
		return "Employee [employeeId=" + employeeId + ", ename=" + ename + ", dept=" + dept + ", email=" + email
				+ ", contact=" + contact + ", salary=" + salary + ", address=" + address + ", designation="
				+ designation + "]";
	}
	
	
}
