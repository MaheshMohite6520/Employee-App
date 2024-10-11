package com.employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update-by-id")
public class UpdateById extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String eid = req.getParameter("eid");

	    Connection conn = null;
	    try 
	    {
	      Class.forName("org.postgresql.Driver");
	      conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp", "postgres", "root");
	    } 
	    catch (Exception e) 
	    {
	      System.out.println("Error connecting to database: " + e.getMessage());
	    }

	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    try 
	    {
	      pstmt = conn.prepareStatement("select * from empproject where eid = ?");
	      pstmt.setString(1, eid);
	      rs = pstmt.executeQuery();

	      if (rs.next()) 
	      {
	        req.setAttribute("name", rs.getString("name"));
	        req.setAttribute("email", rs.getString("email"));
	        req.setAttribute("eid", rs.getString("eid"));
	        req.setAttribute("department", rs.getString("department"));
	        req.setAttribute("contact", rs.getString("contact"));
	        req.setAttribute("salary", rs.getString("salary"));
	        req.setAttribute("address", rs.getString("address"));
	        req.setAttribute("designation", rs.getString("designation"));
	        
	        RequestDispatcher rd = req.getRequestDispatcher("updateById.jsp");
	        rd.forward(req, resp);
	      }
	    } 
	    catch (Exception e) 
	    {
	      System.out.println("Error retrieving employee data: " + e.getMessage());
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
	      catch (Exception e) 
	      {
	        System.out.println("Error closing database connections: " + e.getMessage());
	      }
	    }
	    
	    PrintWriter pw = resp.getWriter();
	    pw.print("<h1>Employee updated successfully</h1>");

	    RequestDispatcher dispatcher = req.getRequestDispatcher("updateById.jsp");
	    dispatcher.include(req, resp);
	}
}
