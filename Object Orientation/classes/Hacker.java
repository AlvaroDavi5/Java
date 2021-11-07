package classes; // set actual package


public class Hacker {
	// attributes
	public String os = "Kali Linux"; // editable for all instances
	private String passwd = "anonymous"; // editable only in class

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

