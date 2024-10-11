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

@WebServlet("/ManagerDataServlet")
public class ManagerDataServlet extends HttpServlet 
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
		
		entityManager.persist(dept);
		
		entityManager.persist(department1);
		entityManager.persist(department2);
		entityManager.persist(department3);
		
		Manager manager = new Manager();
		
		manager.setName(fullName);
		manager.setEmail(email);
		manager.setPassword(password);
		manager.setAddress(address);	
		manager.setDepartment(dept);
		
		entityManager.persist(manager);
		
		entityTransaction.commit();
		
		System.out.println("saved");
	}
}
