package classes;

import java.util.LinkedList;


public class Department {
	// * Attributes
	private String name = "";
	private Company company = null;
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

	public Company getCompany()
	{
		return company;
	}
	public void setCompany(Company company)
	{
		this.company = company;
	}

	public LinkedList<Employee> getEmployees()
	{
		return employees;
	}
	public void addEmployee(Employee employee)
	{
		employee.setDepartment(this);
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

	public void setAllEmployeesSalaryByPercent(float percentage)
	{
		for (Employee employee : employees)
		{
			employee.setSalaryByPercent(percentage);
		}
	}
}
