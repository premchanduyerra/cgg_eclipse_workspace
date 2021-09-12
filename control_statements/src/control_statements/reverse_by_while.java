package control_statements;
import java.util.*;

public class reverse_by_while {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter a num");
		
int a=s.nextInt();
int num=a;
int rev=0;
while(num!=0)
{
	int rem=num%10;
	rev=rem+rev*10;
	num=num/10;

}
System.out.println("reverse num is   "+rev);
	
if(rev==a)
{
	System.out.println("palindrome");
}
else
{
	System.out.println("not a palindrome");
}
}
}