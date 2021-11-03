// lib imports
import java.io.*;


// class Echo
public class Echo
{
	// reverberation attribute
	static int reverb = 2;

	// echo method
	public static void echo(String str)
	{
		for (int i = 0; i <= reverb; i++)
			System.out.print(str);
	}

	// main function from class Echo
	public static void main(String[] args)
	{
		for (int i = 0; i < args.length; i++)
		{
			echo(args[i] + " ");
		}
		System.out.println();
	}
}

