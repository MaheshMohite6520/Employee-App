package com.qsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdminDao 
{
	private EntityManager em;
	
	@Autowired
	public AdminDao(EntityManager em) 
	{
		this.em = em;
	}
	
	public void saveAdmin(Admin admin)
	{
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(admin);
		et.commit();
	}
	
	public Admin findById(int id)
	{
		return em.find(Admin.class, id);
	}
	
	public void updateAdmin(Admin admin)
	{
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.merge(admin);
		et.commit();
	}
}
