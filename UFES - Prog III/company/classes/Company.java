package classes;

import java.util.Arrays;


public class Company {
	// * Attributes
	private int register = 0;
	private String name = "";
	private Department[] departments = { null };

	// ! Constructors
	public Company(int regist) {
		this.register = regist;
	}

	// ? Methods
	public int getRegister()
	{
		return register;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public Department[] getDepartments()
	{
		return departments;
	}
	public void setDepartments(Department[] departments)
	{
		this.departments = departments;
	}
	public void addDepartment(Department department)
	{
		if (departments[departments.length -1] != null)
		{
			this.departments = Arrays.copyOf(departments, departments.length +1);
		}
		this.departments[departments.length -1] = department;
	}
	public void clearDepartments()
	{
		this.departments = null;
	}
}
