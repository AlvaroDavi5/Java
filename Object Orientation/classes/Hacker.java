package classes; // set actual package


public class Hacker {
	// attributes
	public String os = "Kali Linux"; // accessible on all instances
	private String passwd = "anonymous"; // accessible only in the origin class
	// to access method from the same package use 'default' and to access method in any extended class use 'protected'

	// methods
	public void hackNasa()
	{
		for (int i = 0; i < 7; i++)
			System.out.println("Hacking NASA...");
		System.out.println("Done!");
	}
	public void setPass(String pass)
	{
		passwd = pass;
	}
	public void showPass()
	{
		System.out.println("Mr. Robot password: " + passwd); // encapsulation: to manipulate class attributes using only class methods
	}
}

