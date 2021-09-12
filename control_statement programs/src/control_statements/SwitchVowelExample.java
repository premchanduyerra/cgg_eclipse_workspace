package control_statements;
import java.util.*;
public class SwitchVowelExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a alphabet to know whether a vowel or consonant");
		char ch=s.next().charAt(0);
//char ch='a';
switch(ch)
{
case 'a':
{
	System.out.println("vowel");
	break;
}
case 'e':
{
	System.out.println("vowel");
	break;
}
case 'i':
{
	System.out.println("vowel");
	break;
}
case 'o':
{
	System.out.println("vowel");
	break;
}
case 'u':
{
	System.out.println("vowel");
	break;
}
case 'A':
{
	System.out.println("vowel");
	break;
}
case 'E':
{
	System.out.println("vowel");
	break;
}
case 'I':
{
	System.out.println("vowel");
	break;
}
case 'O':
{
	System.out.println("vowel");
	break;
}
case 'U':
{
	System.out.println("vowel");
	break;
}
default:
{
	System.out.println("consonant");
}

}
	}

}
