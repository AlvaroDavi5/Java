package classes;


public class EmployeeWithWorkingHours extends Employee {
	private int workingHours = 0;
	private boolean isPartialTimeEmployee = true;

	public EmployeeWithWorkingHours(String id, String name) {
		super(id, name);
	}

	public int getWorkingHours()
	{
		return workingHours;
	}
	public void setWorkingHours(int workingHours)
	{
		this.workingHours = workingHours;
	}

	public boolean isPartialTimeEmployee()
	{
		return isPartialTimeEmployee;
	}
}
