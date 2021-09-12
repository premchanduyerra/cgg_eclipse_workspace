package control_statements;
import java.util.*;

public class switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter num1");
int a=s.nextInt();
System.out.println("enter num 2");

int b=s.nextInt();
System.out.println("enter a operator in arithmatic operators");
char t;
t=s.next().charAt(0);
switch(t)
{
case '+':
{
	System.out.println(a+b);
	break;
}
case '-' :
{
	System.out.println(a-b);
	break;
	
}
case '*':
{
	System.out.println(a*b);
	break;
}
case '/':
{
	System.out.println(a/b);
	break;
}
default:
	System.out.println("invalid.....try again");
}
	}

}
