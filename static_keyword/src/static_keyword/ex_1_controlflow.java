package static_keyword;

public class ex_1_controlflow 
{
	static int a=10;
	
public static void main(String[] args)
	{
		
		int a=100;//priority to the modified block
		//int b=400;
		int b=300;
		System.out.println(a);//local priority
		System.out.println(ex_1_controlflow.a);//global access with class name
		System.out.println(b);
		System.out.println(ex_1_controlflow.b);
	}
		static int b=20;
}
