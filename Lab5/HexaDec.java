package gsv.lab5;
//Question2

import java.util.Scanner;

class InvalidHexaDecimalException extends Exception
{
	public InvalidHexaDecimalException(String message)
	{
		super(message);
	}
}



public class HexaDec {
	public static void checkHexadecimal(String input) throws InvalidHexaDecimalException
	{
		if(!input.matches("[0-9a-fA-F]+"))
		{
			throw new InvalidHexaDecimalException("The number is not a valid hexadecimal");
		}
	}
	
	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();
		
		try
		{
			checkHexadecimal(number);
			System.out.println("The number is a valid hexadecimal");
		}
		catch(InvalidHexaDecimalException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Ending the program");
		}
		scanner.close();
	}
}
