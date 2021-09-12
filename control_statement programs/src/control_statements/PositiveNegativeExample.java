package control_statements;
import java.util.*;
public class PositiveNegativeExample
{
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	public static void main(String[] args)
	{    
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int number=s.nextInt();
	    if(number>0)
	    {  
	    System.out.println("POSITIVE");  
	    }
	    else if(number<0)
	    {  
	    System.out.println("NEGATIVE");  
	    }
	    else
	    {  
	    System.out.println("ZERO");  
	    }  
	}    
}  
