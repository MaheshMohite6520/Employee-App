package com.employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet
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
			
			PreparedStatement ps = con.prepareStatement("insert into empproject values (?, ?, ?, ?, ?, ?, ?, ?)");
			
			ps.setString(1, eid);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setString(4, department);
			ps.setLong(5, contact);
			ps.setDouble(6, salary);
			ps.setString(7, address);
			ps.setString(8, designation);
			
			ps.executeUpdate();
			
			con.close();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		PrintWriter pw = resp.getWriter();
		pw.print("<h1>Employee added successfully........!</h1>");
		
		RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
		rd.include(req, resp);
	}
}
