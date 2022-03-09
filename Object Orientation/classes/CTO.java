package classes; // set actual package


public class CTO {
	// attributes
	public String de = "KDE";
	public String name = null;
	public int age = 0;

	// constructor method
	public CTO(String myName)
	{
		this.name = myName;
	}
	// @Overload (overload the method with different signature but same identifier)
	public CTO(int myAge)
	{
		this.age = myAge;
	}

	public void setDesktopEnvironment(String deskEnv)
	{
		de = deskEnv;
	}
	public void showDesktopEnvironment()
	{
		System.out.println(name + " desktop environment: " + de); // encapsulation: to manipulate class attributes using only class methods
	}
}

