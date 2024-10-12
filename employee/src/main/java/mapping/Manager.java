package mapping;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Cacheable
@Table(name = "manager_table")
public class Manager 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String email;
    private String password;
    private long contact;
    private String address;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Department department;

	public Department getDepartment() 
	{
		return department;
	}

	public void setDepartment(Department department) 
	{
		this.department = department;
	}

	public int getId() 
	{
		return id;
	}

//	public void setId(int id) 
//	{
//		this.id = id;
//	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}

	public long getContact() 
	{
		return contact;
	}

	public void setContact(long contact) 
	{
		this.contact = contact;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}
    
	public Manager() 
	{
		// TODO Auto-generated constructor stub
	}
}