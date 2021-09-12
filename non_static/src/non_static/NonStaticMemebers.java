package non_static;

public class NonStaticMemebers {

	
		static int a = 10;
		static int b = 20;

		int x = 30;
		int y = 40;

		static void m1()	
		{
			System.out.println(a);
			System.out.println(b);
		}

		void m2(){}

		public static void main(String[] args) 
		{
			int p = 50;
			int q = 60;
			System.out.println(a);
			System.out.println(b);
			m1();//static block calling
			//System.out.println(x); not executing this statement
			//System.out.println(y);
		}
	}
