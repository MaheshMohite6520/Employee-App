package com.employee;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SearchEmployeeServlet")
public class SearchEmployeeServlet extends HttpServlet
{	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String search = req.getParameter("search");
	    
	    if(search != null && !search.isEmpty()) 
	    {
	        SearchEmployee se = new SearchEmployee();
	        
	        ArrayList<Employee> employees = se.searchEmployee(search);
	        
	        System.out.println(employees);
	        
	        if(employees != null && !employees.isEmpty()) 
	        {
	            req.setAttribute("employees", employees);
	            req.getRequestDispatcher("SearchDisplay.jsp").forward(req, resp);
	        } 
	        else 
	        {
	            req.setAttribute("message", "No employees found");
	            req.getRequestDispatcher("SearchDisplay.jsp").forward(req, resp);
	        }
	    } 
	    else 
	    {
	    	req.setAttribute("message", "Please enter a search term");
	        req.getRequestDispatcher("viewEmployees.jsp").forward(req, resp);
	    }
	}
}
