package com.employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateEmployeeServlet")
public class UpdateEmployeeServlet extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String eid = req.getParameter("eid");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
	    String department = req.getParameter("department");
	    long contact = Long.parseLong(req.getParameter("contact"));
	    double salary = Double.parseDouble(req.getParameter("salary"));
	    String address = req.getParameter("address");
	    String designation = req.getParameter("designation");
	    
	    try
	    {
	    	Class.forName("org.postgresql.Driver");
	    	
	    	Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp", "postgres", "root");
	    	
	    	PreparedStatement ps = con.prepareStatement("update empproject set name = ?, email = ?, department = ?, contact = ?, salary = ?, address = ?, designation = ? where eid = ?");
	    	
	    	 ps.setString(1, name);
	         ps.setString(2, email);
	         ps.setString(3, department);
	         ps.setLong(4, contact);
	         ps.setDouble(5, salary);
	         ps.setString(6, address);
	         ps.setString(7, designation);
	         ps.setString(8, eid);
	         
	         ps.executeUpdate();
	         
	         con.close();
	         
	        PrintWriter pw = resp.getWriter();
	 		pw.print("<h1>Employee updated successfully........!</h1>");
	         
	 		RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
	 		req.setAttribute("message", "Employee updated successfully");
	 		rd.forward(req, resp);
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	}
}
