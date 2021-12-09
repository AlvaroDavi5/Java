import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileManager {

	public static void reader(String path) throws IOException
	{
		FileReader reader = new FileReader(path);
		BufferedReader buff = new BufferedReader(reader);
		String line = "";

		while (true)
		{
			if (line != null)
			{
				System.out.println(line);
			}
			else
			{
				break;
			}
			line = buff.readLine();
		}

		buff.close();
	}

	public static void writer(String path) throws IOException
	{
		FileWriter writer = new FileWriter(path);
		BufferedWriter buff = new BufferedWriter(writer);
		String line = "";

		Scanner in = new Scanner(System.in);
		System.out.println("Type anything: ");
		line = in.nextLine();
		buff.append(line + '\n');
		buff.close();
	}


	public static void main(String[] args) throws IOException
	{
		writer(args[0]);
		reader(args[1]);
	}
}
