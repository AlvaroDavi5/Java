package classes;

import java.util.Arrays;


public class Department {
	// * Attributes
	private String name = "";
	private int employeesNumber = 0;
	private Employee[] employees = { null };

	// ! Constructors
	public Department(String name) {
		this.name = name;
	}

	// ? Methods
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public Employee[] getEmployees()
	{
		return employees;
	}
	public void setEmployees(Employee[] employees)
	{
		this.employees = employees;
		this.employeesNumber = (employees.length);
	}
	public void addEmployee(Employee employee)
	{
		if (employees[employees.length -1] != null)
		{
			this.employees = Arrays.copyOf(employees, employees.length +1);
		}
		this.employees[employees.length -1] = employee;
		this.employeesNumber++;
	}
	public void clearEmployees()
	{
		this.employees = null;
		this.employeesNumber = 0;
	}
	public int getEmployeesNumber()
	{
		return employeesNumber;
	}
}
