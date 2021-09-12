package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			System.out.println("Enter a and b ");
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			int b=s.nextInt();
			int c=a/b;
			int e=a/b;
			System.out.println(1/a);
		}
			catch(ArithmeticException ae)
			{
				System.out.println("/by zero");
			}
		catch(InputMismatchException ime)
		{
			System.out.println("enter only integers");
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("hello");
		}

	}

}
