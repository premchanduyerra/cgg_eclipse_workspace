package exceptions;

public class Itccf {
	class InnerTryCatchCF 
	{
		public void main(String[] args) 
		{
			try
			{			
				System.out.println("Inside outter try");
				System.out.println(10/0);

				try
				{
					System.out.println("Inside Inner try");
				}
				catch(ArithmeticException ae)
				{
					System.out.println("Inside Inner catch");
				}
				System.out.println("After inner catch");
			}
			catch(NullPointerException ae)
			{
				System.out.println("Inside outter catch");
			}
			System.out.println("After outter catch");
		}
	}

}
