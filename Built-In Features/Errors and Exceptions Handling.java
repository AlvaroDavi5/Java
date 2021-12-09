import java.lang.UnknownError;


public class Exceptions {
	public static void main(String[] args) {

		try
		{
			// try execute this code block...
			int argA = Integer.parseInt(args[0]);
			int argB = Integer.parseInt(args[1]);
			float argDiv = (argA / argB);
			System.out.println(argDiv);
		} // (...) if an exception occurs catch exception type, and try execute the code blocks bellow
		catch (NumberFormatException exception)
		{
			System.out.println("Invalid input format");
		}
		catch (ArrayIndexOutOfBoundsException exception)
		{
			System.out.println("Invalid number of arguments");
		}
		catch (ArithmeticException exception)
		{
			System.out.println("Division by zero is invalid division");
		}
		catch (Exception exception)
		{
			System.out.println("Unknown exception");
		}
		finally
		{
			// end exception handling...
			throw new UnknownError("Unknown error"); // (...) creating a error
		}

		Exception e = new Exception(); // instantiate exception
		System.out.println(e);
	}
}
