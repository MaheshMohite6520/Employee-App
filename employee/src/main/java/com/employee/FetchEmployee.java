package com.employee;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fetch-emp")
public class FetchEmployee extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		try
		{
			System.out.println("Loading PostgreSQL driver...");
			Class.forName("org.postgresql.Driver");
			System.out.println("PostgreSQL driver loaded...");
			
			System.out.println("Establishing connection...");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp", "postgres", "root");
			System.out.println("Connection established...");
			
			System.out.println("Preparing SQL query...");
			PreparedStatement ps = con.prepareStatement("select * from employee_table");
			System.out.println("SQL query prepared...");
			
			System.out.println("Executing SQL query...");
			ResultSet rs = ps.executeQuery();
			System.out.println("SQL query executed...");
			
			ArrayList<Employee> employees = new ArrayList<>();
			
			while(rs.next())
			{
				Employee employee = new Employee();
				
				employee.setEmployeeId(rs.getInt("employeeid"));
				employee.setEname(rs.getString("fullname"));
				employee.setEmail(rs.getString("email"));
				employee.setContact(rs.getLong("contact"));
				employee.setAddress(rs.getString("address"));
				
				employees.add(employee);
			}
			
			System.out.println("Employees size: " + employees.size());
			
			con.close();
			
			req.setAttribute("employees", employees);
			
			RequestDispatcher rd = req.getRequestDispatcher("viewEmployees.jsp");
			rd.forward(req, resp);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
