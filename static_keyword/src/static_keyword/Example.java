package static_keyword;

public class Example 
{
	static int a = m1();//direct call to the block
	static int b = m2();
	
	static 
	{
		System.out.println("Example SB");
	}

	private static int m1()
	{
		System.out.println("Example m1:a");
		return 10;
	}
	public static int m2()
	{
		System.out.println("Example m2:b");
		return 20;
	}

	public static void main(String[] args) 
	{
		System.out.println("Example main");
	}
}
