package mapping;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
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
		String department = req.getParameter("department");
		
		Department dept = new Department();
		dept.setName(department);
		
		Department department1 = new Department();
		department1.setName("Fullstack");

		Department department2 = new Department();
		department2.setName("Development");

		Department department3 = new Department();
		department3.setName("Testing");
		
		entityTransaction.begin();
		
		entityManager.persist(department1);
		entityManager.persist(department2);
		entityManager.persist(department3);
		
		entityManager.persist(dept);
		
		Employee employee = new Employee();

		employee.setDepartment(dept);
		employee.setFullName(fullName);
		employee.setEmail(email);
		employee.setPassword(password);
		employee.setContact(contact);
		employee.setAddress(address);
			
		entityManager.persist(employee);
		
		entityTransaction.commit();
		
		System.out.println("saved");
	}
}
