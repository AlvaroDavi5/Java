package classes;


public class Employee {
	// * Attributes
	private String id = "";
	private String name = "";
	private Department department = null;
	private float salary = 0.0f;

	// ! Constructors
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	// ? Methods
	public String getId()
	{
		return id;
	}
	public void setId(String id)
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

	public Department getDepartment()
	{
		return department;
	}
	public void setDepartment(Department department)
	{
		this.department = department;
	}

	public float getSalary()
	{
		return salary;
	}
	public void setSalary(float salary)
	{
		this.salary = salary;
	}
}
