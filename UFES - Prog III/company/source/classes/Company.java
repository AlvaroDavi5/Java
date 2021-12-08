package classes;

import java.util.LinkedList;


public class Company {
	// * Attributes
	private int register = 0;
	private String name = "";
	private LinkedList<Department> departments = new LinkedList<Department>();
	Employee president = null;

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

	public LinkedList<Department> getDepartments()
	{
		return departments;
	}
	public void addDepartment(Department department)
	{
		department.setCompany(this);
		departments.add(department);
	}
	public void clearDepartments()
	{
		departments.clear();
	}
	public int getDepartmentsNumber()
	{
		return departments.size();
	}

	public int getPartialTimeEmployeesNumber()
	{
		int partialTimeEmployeesNumber = 0;
		for (Department department : departments) {
			LinkedList<Employee> employees = department.getEmployees();
			for (Employee employee : employees)
			{
				if (employee.isFullTimeEmployee() != true)
				{
					partialTimeEmployeesNumber++;
				}
			}
		}
		return partialTimeEmployeesNumber;
	}

	public Employee getPresident()
	{
		return president;
	}
	public void setPresident(Employee president)
	{
		this.president = president;
	}

	public void setAllDepartmentsSalaryByPercent(float percent)
	{
		for (Department department : departments) {
			department.setAllEmployeesSalaryByPercent(percent);
		}
	}
}
