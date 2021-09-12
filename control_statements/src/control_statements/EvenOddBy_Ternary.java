package control_statements;
import java.util.*;
public class EvenOddBy_Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);

int num;
System.out.println("enter a num");
num=s.nextInt();
String result;
result=(num%2==0)?"even":"odd";
System.out.println(result);
}

}
