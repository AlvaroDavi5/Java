import classes.Hacker; // import 'Hacker' class from 'classes' package


class Developer extends Hacker { // heritage: the 'Developer' sub-class inherits the attributes and methods of the 'Hacker' super-class
	private String[] languages = {"C", "C++", "Java", "Python"};

	public int getLanguagesNum()
	{
		return (languages.length);
	}
	public void showLanguages()
	{
		for (int i = 0; i < this.getLanguagesNum(); i++) // class self reference with 'this'
			System.out.println(languages[i]);
	}
	public void hackNasa() { return; } // polymorphism: subclass can invoke superclass methods, changing its behavior by overriding methods
}

public class Main {
	public static void main(String[] args)
	{
		Hacker mr_robot = new Hacker(); // instantiation: create object, a class instance
		Developer dev = new Developer();

		mr_robot.hackNasa();
		System.out.println();
		System.out.format("Mr. Robot uses %s as your OS.\n", mr_robot.os);

		System.out.println();
		System.out.print("Old "); mr_robot.showPass();
		mr_robot.setPass("we_are_legion"); // setter method
		System.out.print("New "); mr_robot.showPass();

		System.out.println();
		System.out.format("The developer programs in %d programming languages:\n", dev.getLanguagesNum()); // getter method
		dev.showLanguages(); // display method
		dev.hackNasa();
	}
}

