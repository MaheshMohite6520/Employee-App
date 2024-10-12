package mapping;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Cacheable
@Table(name = "employee_table")
public class Employee 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;
    
    private String fullName;
    private String email;
    private String password;
    private long contact;
    private String address;

    @JoinColumn(name = "department_id")
    @ManyToOne(cascade = CascadeType.ALL)
    private Department department;

	public Department getDepartment() 
	{
		return department;
	}

	public void setDepartment(Department department) 
	{
		this.department = department;
	}

	public Employee() 
    {
    	
    }

    public Employee(String fullName, String email, String password, long contact, String address) 
    {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.contact = contact;
        this.address = address;
    }

    public int getEmployeeId() 
    {
        return employeeId;
    }

//    public void setEmployeeId(int employeeId) 
//    {
//        this.employeeId = employeeId;
//    }

    public String getFullName() 
    {
        return fullName;
    }

    public void setFullName(String fullName) 
    {
        this.fullName = fullName;
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
}