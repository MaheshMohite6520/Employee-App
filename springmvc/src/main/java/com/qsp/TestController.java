package com.qsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController 
{
	@GetMapping("/home")
	public String getHi()
	{
		return "home.jsp";
	}
	
	@GetMapping("/reg")
	public void register(HttpServletRequest request, HttpServletResponse response)
	{
		try
		{
			PrintWriter pw = response.getWriter();
			
			String name = request.getParameter("un");
			String phone = request.getParameter("ph");
			String email = request.getParameter("em");
			
			pw.print("<h1> Name: " + name + " </h1>");
			pw.print("<h1> Phone: " + phone + " </h1>");
			pw.print("<h1> Email: " + email + " </h1>");
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	@GetMapping("/sum")
	public void sum(@RequestParam int n1, @RequestParam int n2, HttpServletResponse response) throws IOException
	{
		PrintWriter pw = response.getWriter();
		
		int result = n1 + n2;
		
		pw.print("<h1> Sum: " + result + " </h1>");
	}
	
	@GetMapping("/data")
	public String getDetails(Model m)
	{
		m.addAttribute("name", "Raju");
		m.addAttribute("email", "raju@gmail.com");
		
		return "details.jsp";
	}
	
	@GetMapping("/student")
	public ModelAndView sendStudent()
	{
		ModelAndView mv = new ModelAndView("student.jsp");
		
		mv.addObject("n", "Virat");
		mv.addObject("p", "181818");
		mv.addObject("e", "virat@anushka.com");
		
		return mv;
	}
	
//	@GetMapping("/emp")
//	public ModelAndView getEmployee(@ModelAttribute Employee e)
//	{
//		ModelAndView mv = new ModelAndView("displayEmp.jsp");
//		
//		mv.addObject("emp", e);
//		
//		return mv;
//	}
	
	// <------------------------------ Project --------------------------------------------->
	
	@Autowired
	EmployeeDao dao;
	
	@Autowired
	AdminDao adminDao;
	
	// Save Employee in Database
	@GetMapping("/emp")
	public ModelAndView getEmployee(@ModelAttribute Employee e)
	{
		dao.saveEmployee(e);
		
		ModelAndView mv = new ModelAndView("displayAll");
		
		return mv;
	}
	
	// Display all Employees
	@GetMapping("/displayAll")
	public ModelAndView findAllEmployee()
	{
		List<Employee> list =  dao.fetchAllEmployee();
		
		ModelAndView mv = new ModelAndView("displayEmp.jsp");
		mv.addObject("list", list);
		
		return mv;
	}
	
	// Delete Employee
	@GetMapping("/delete")
	public ModelAndView deleteEmp(@RequestParam(name= "id") int id)
	{
		dao.deleteEmployeeById(id);
		
		ModelAndView mv = new ModelAndView("displayAll");
		
		return mv;
	}	
	
	// Admin Edited by himself
	@GetMapping("/adminEdit")
	public ModelAndView editEmp(@RequestParam(name = "id") int id)
	{
		Admin admin = adminDao.findById(id);
		
		ModelAndView mv = new ModelAndView("updateAdmin.jsp");
		mv.addObject("admin", admin);
		
		return mv;
	}
	
	// Employee Edited by Admin
	@GetMapping("/empEdit")
	public ModelAndView editEmp2(@RequestParam(name = "id") int id)
	{
		Employee employee = dao.findById(id);
		
		ModelAndView mv = new ModelAndView("updateEmp.jsp");
		mv.addObject("emp", employee);
		
		return mv;
	}
	
	// Employee Edited by himself
	@GetMapping("/employeeEdit")
	public ModelAndView editEmployee(@RequestParam(name = "id") int id)
	{
		Employee employee = dao.findById(id);
			
		ModelAndView mv = new ModelAndView("updateEmployee.jsp");
		mv.addObject("emp", employee);
			
		return mv;
	}
	
	// Admin update (by Admin himself)
	@GetMapping("/adminUpdate")
	public ModelAndView updateEmp(@ModelAttribute Admin admin)
	{
		adminDao.updateAdmin(admin);
		
		ModelAndView mv = new ModelAndView("adminProfile");
		return mv;
	}
	
	// Employee updated by Admin
	@GetMapping("/EmpUpdate")
	public ModelAndView updateEmp2(@ModelAttribute Employee emp)
	{
		dao.updateEmployee(emp);
			
		ModelAndView mv = new ModelAndView("displayAll");
		return mv;
	}
	
	// Employee updated by himself
	@GetMapping("/EmployeeUpdate")
	public ModelAndView updateEmployee(@ModelAttribute Employee emp)
	{
		dao.updateEmployee(emp);
				
		ModelAndView mv = new ModelAndView("empProfile");
		mv.addObject("emp", emp);
		return mv;
	}
	
	// Find Employee By id
	@GetMapping("/empProfile")
	public ModelAndView findEmployee(@RequestParam(name = "id") int id)
	{
		Employee employee =  dao.findById(id);
		
		ModelAndView mv = new ModelAndView("empProfile.jsp");
		mv.addObject("emp", employee);
		
		return mv;
	}
	
	// Save Employee in Database
	@GetMapping("/saveEmp")
	public ModelAndView employeeProfile(@ModelAttribute Employee employee)
	{
		dao.saveEmployee(employee);
		
		ModelAndView mv = new ModelAndView("empProfile.jsp");
		mv.addObject("emp", employee);
		
		return mv;
	}
	
	// Save Admin in Database
	@GetMapping("/saveAdmin")
	public ModelAndView adminProfile(@ModelAttribute Admin admin)
	{
		adminDao.saveAdmin(admin);
		
		ModelAndView mv = new ModelAndView("adminProfile");
		
		return mv;
	}
	
	// Find Admin by id
	@GetMapping("/adminProfile")
	public ModelAndView findAdmin(@RequestParam(name = "id") int id)
	{
	 	Admin admin = adminDao.findById(id);
		
		ModelAndView mv = new ModelAndView("adminProfile.jsp");
		mv.addObject("admin", admin);
		
		return mv;
	}
}
