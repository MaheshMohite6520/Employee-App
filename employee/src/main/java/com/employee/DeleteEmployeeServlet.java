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

@WebServlet("/DeleteEmployeeServlet")
public class DeleteEmployeeServlet extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String eid = req.getParameter("eid");
		
		try
	    {
	    	Class.forName("org.postgresql.Driver");
	    	
	    	Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp", "postgres", "root");
	    	
	    	PreparedStatement ps = con.prepareStatement("delete from empproject where eid = ?");
	    	
	         ps.setString(1, eid);
	         
	         ps.executeUpdate();
	         
	         con.close();
	         
	        PrintWriter pw = resp.getWriter();
	 		pw.print("<h1>Employee deleted successfully........!</h1>");
	         
	         RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
	         rd.include(req, resp);
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	}
}
