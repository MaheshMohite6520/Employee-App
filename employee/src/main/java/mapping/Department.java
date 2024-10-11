package mapping;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
    
    @OneToOne(mappedBy = "department")
    private Manager manager;
   
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

    // Getters and setters 
	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
}