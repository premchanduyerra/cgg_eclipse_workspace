package control_statements;
import java.util.*;
public class If_else_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter num");
		int num=s.nextInt();
		if (num%2==0)
		{
			System.out.println("even number");
			
		}
		else
		{
			System.out.println("odd number");
		}
	}

}
