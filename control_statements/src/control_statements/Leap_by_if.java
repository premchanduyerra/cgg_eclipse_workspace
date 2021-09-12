package control_statements;
import java.util.*;
public class Leap_by_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner (System.in);
int year;
System.out.println("enter year");
year=s.nextInt();
		if((year%4==0&&year%100!=0)||(year%400==0))
		{
			System.out.println("leap year ");
		}
		else 
		{
			System.out.println("not a leap year");
		}
	}

}
