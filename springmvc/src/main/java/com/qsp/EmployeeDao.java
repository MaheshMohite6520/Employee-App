package com.qsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDao 
{
//	@Autowired
	private EntityManager em;
	
	@Autowired
	public EmployeeDao(EntityManager em) 
	{
		this.em = em;
	}
	
	public void saveEmployee(Employee employee)
	{
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(employee);
		et.commit();
	}
	
	public Employee findById(int id)
	{
		return em.find(Employee.class, id);
	}
	
	public void deleteEmployeeById(int id)
	{
		Employee employee = findById(id);
		
		if(employee != null)
		{
			EntityTransaction et = em.getTransaction();
			
			et.begin();
			em.remove(employee);
			et.commit();
		}
		else
		{
			System.out.println("ID is not Present.");
		}
	}
	
	public void updateEmployee(Employee employee)
	{
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.merge(employee);
		et.commit();
	}
	
	public List<Employee> fetchAllEmployee()
	{
		Query query = em.createQuery("select e from Employee e");
		return query.getResultList();
	}
}
