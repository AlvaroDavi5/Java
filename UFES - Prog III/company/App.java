import classes.*;


public class App {

	public static void main(String[] args)
	{
		Company freeSoftwareFoundation = new Company(2417);
		Department linux = new Department("Linux Kernel");
		Department git = new Department("Git: Code Versioner");
		Department gpt3 = new Department("GPT-3: Text Transformer");

		freeSoftwareFoundation.setName("Free Software Foundation");
		freeSoftwareFoundation.addDepartment(linux);
		freeSoftwareFoundation.addDepartment(git);
		freeSoftwareFoundation.addDepartment(gpt3);

		Employee torvalds = new Employee("soft_eng-0001", "Linus Torvalds");
		torvalds.setSalary(167000f);
		torvalds.setDepartment(linux);
		linux.addEmployee(torvalds);
		Employee gates = new Employee("comp_sci-0164", "Dennis Ritchie");
		gates.setSalary(430000f);
		gates.setWorkingHours(25);
		gates.setDepartment(git);
		Employee stallman = new Employee("proj_man-0010", "Richard Stallman");
		stallman.setSalary(550000f);
		stallman.setDepartment(git);
		git.addEmployee(gates);
		git.addEmployee(stallman);
		Employee musk = new Employee("co_chair-0001", "Elon Musk");
		musk.setSalary(750000f);
		musk.setDepartment(gpt3);
		gpt3.addEmployee(musk);

		float meanSalaryCompany = 0.0f;
		int employeesNumCompany = 0;
		Department[] depts = freeSoftwareFoundation.getDepartments();
		for (Department dep: depts)
		{
			float meanSalaryDepartment = 0.0f;
			int employeesNumDepartment = 0;
			Employee[] empls = dep.getEmployees();
			for (Employee emp : empls)
			{
				System.out.println("·Salary of " + emp.getName() + ": $ " + emp.getSalary());
				meanSalaryDepartment += emp.getSalary();
				employeesNumDepartment++;
				meanSalaryCompany += emp.getSalary();
				employeesNumCompany++;
			}
			meanSalaryDepartment = meanSalaryDepartment / (employeesNumDepartment*1.0f);
			System.out.println(" - '" + dep.getName() + "' department salary mean: " + meanSalaryDepartment + "\n");
		}
		meanSalaryCompany = meanSalaryCompany / (employeesNumCompany*1.0f);
		System.out.println("  >> \"" + freeSoftwareFoundation.getName() + "\" company salary mean: " + meanSalaryCompany);

		return;
	}
}
