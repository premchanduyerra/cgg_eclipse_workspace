package control_statements;
import java.util.*;
public class SwitchStringExample 
{

	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("enter the level");
		String levelstr=s.next();
		// TODO Auto-generated method stub
//String levelstr="beginner";
switch(levelstr)
{
case "beginner":
{
	System.out.println("level 1");
	break;
}
case "intermediate":
{
	System.out.println("level 2");
	break;
}
case "expert":
{
	System.out.println("level 3");
	break;
}
default:
{
	System.out.println("your level is still zero");
}
}
	}

}
