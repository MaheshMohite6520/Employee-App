package com.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;

@WebServlet("/SearchEmployee")
public class SearchEmployee 
{
	public ArrayList<Employee> searchEmployee(String search) 
	{
		ArrayList<Employee> employees = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try 
		{
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp", "postgres", "root");
			
			pstmt = conn.prepareStatement("select * from empproject where eid like ? or name like ? or department like ? or address like ? or designation like ?");
			
			pstmt.setString(1,  "%" + search + "%");
			pstmt.setString(2,  "%" + search + "%");
			pstmt.setString(3,  "%" + search + "%");
			pstmt.setString(4,  "%" + search + "%");
			pstmt.setString(5,  "%" + search + "%");
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) 
			{
				Employee employee = new Employee();
				
				employee.setEmployeeId(rs.getInt("eid"));
				employee.setEname(rs.getString("name"));
				employee.setEmail(rs.getString("email"));
				employee.setDept(rs.getString("department"));
				employee.setContact(rs.getLong("contact"));
				employee.setSalary(rs.getDouble("salary"));
				employee.setAddress(rs.getString("address"));
				employee.setDesignation(rs.getString("designation"));
				
				employees.add(employee);
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 
		finally 
		{
			try 
			{
				if (rs != null) 
				{
					rs.close();
				}
				
				if (pstmt != null) 
				{
					pstmt.close();
				}
				
				if (conn != null) 
				{
					conn.close();
				}
				
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		return employees;
	}
}
