package mapping;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeDataServlet")
public class EmployeeDataServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		String fullName = req.getParameter("fullName");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		long contact = Long.parseLong(req.getParameter("contact"));
		String address = req.getParameter("address");
		String departmentName = req.getParameter("department");
		
		// Retrieve the existing department by its name
        Department department = entityManager.createQuery("SELECT d FROM Department d WHERE d.name = :departmentName", Department.class)
                .setParameter("departmentName", departmentName)
                .getResultList()
                .stream()
                .findFirst()
                .orElse(null);
        
        if (department == null) 
        {
            // If the department does not exist, create a new one
            department = new Department();
            department.setName(departmentName);
            entityManager.persist(department);
        }
		
		entityTransaction.begin();
		
		Employee employee = new Employee();

		employee.setDepartment(department);
		employee.setFullName(fullName);
		employee.setEmail(email);
		employee.setPassword(password);
		employee.setContact(contact);
		employee.setAddress(address);
			
		entityManager.persist(employee);
		
		entityTransaction.commit();
		
		System.out.println("saved");
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.print("Registration successfull.........");
		
		req.setAttribute("email", email);
		req.setAttribute("fullName", fullName);
		req.setAttribute("password", password);
		req.setAttribute("contact", contact);
		req.setAttribute("address", address);
		req.setAttribute("department", department);
		
		req.setAttribute("message", "Registration successful!");
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("employeeProfile.jsp");
		requestDispatcher.forward(req, resp);
	}
}
