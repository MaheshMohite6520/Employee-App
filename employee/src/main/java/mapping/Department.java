package mapping;

import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Cacheable
@Table(name = "department_table")
public class Department 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String name;
    
    @OneToOne(mappedBy = "department", cascade = CascadeType.ALL)
    @JoinColumn(name = "manager_id")
    private Manager manager;
    
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Employee> employees;
    

	public List<Employee> getEmployees() 
	{
		return employees;
	}

	public void setEmployees(List<Employee> employees) 
	{
		this.employees = employees;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

    // Getters and setters 
	public int getId() 
	{
		return id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	 public Manager getManager() 
	 {
		return manager;
	 }

	public void setManager(Manager manager) 
	{
		this.manager = manager;
	}
	
	public Department() 
    {
		// TODO Auto-generated constructor stub
	}
}