package classes;

import java.util.LinkedList;


public class Department {
	// * Attributes
	private String name = "";
	private LinkedList<Employee> employees = new LinkedList<Employee>();

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

	public LinkedList<Employee> getEmployees()
	{
		return employees;
	}
	public void addEmployee(Employee employee)
	{
		employees.add(employee);
	}
	public void removeEmployee(Employee employee)
	{
		employees.remove(employee);
	}
	public void transferEmployee(Employee employee, Department department)
	{
		removeEmployee(employee);
		department.addEmployee(employee);
	}
	public void clearEmployees()
	{
		employees.clear();
	}
	public int getEmployeesNumber()
	{
		return employees.size();
	}

	// set salary for all employees by percentage
	public void setAllEmployeesSalaryByPercent(float percentage)
	{
		for (Employee employee : employees)
		{
			employee.setSalaryByPercent(percentage);
		}
	}
}
