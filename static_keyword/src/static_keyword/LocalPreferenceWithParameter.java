package static_keyword;

public class LocalPreferenceWithParameter

{
	static int a ;
	static int b ;

	static void m1()
	{
		a = 10;
		b = 20;
	}
	static void m2()
	{
		//int a;
		a = 50;
		b = 60;
	}
	static void m3(int x, int y)
	{
		a = x;
		b = y;
	}
	static void m4(int a, int b)
	{
		a = a; 
	
		b = b;
	}
	static void m5(int a, int b)
	{
		LocalPreferenceWithParameter.a = a;
		LocalPreferenceWithParameter.b = b;
	}

	public static void main(String[] args) 
	{
		System.out.println(a +"..." + b); //0 ... 0

		m1();
		System.out.println(a +"..m1()." + b); //10 ... 20 (given in method)

		m2();
		System.out.println(a +"..." + b); //50 ... 60(given in method)

		m3(70, 80);
		System.out.println(a +"..." + b); //70 ... 80(we are passing values)

		m4(5, 6);
		System.out.println(a +"..." + b); //70 ... 80(passing values are not assigned because

		m5(8, 9);
		System.out.println(a +"..." + b); //8 ... 9 // changing values globally here

		
		//m2();
		//System.out.println(a +"..." + b); //50 ... 60(giving in the method)

	}
}
