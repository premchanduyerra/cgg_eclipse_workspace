package control_statements;
import java.util.*;
public class IfElseIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter marks");
		int m=s.nextInt();
if(m<50)
{
	System.out.println("fail");
}
else if(m>=50&&m<60)
{
	System.out.println("D grade");
}
else if(m>=60&&m<70)
{
	System.out.println("C grade");
}
else if(m>=70&&m<80)
{
	System.out.println("B grade");
}
else if(m>=80&&m<90)
{
	System.out.println("A grade");
}
else if(m>=100&&m<90)
{
	System.out.println("A+ grade");
}
else
{
	System.out.println("invalid");
}
	}

}
