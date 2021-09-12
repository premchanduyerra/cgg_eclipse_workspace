package non_static;

public class Ex {

			int x = 10;
			int y = 20;

			void m1()
			{	
				System.out.println("In m1");
				System.out.println(x + " .... "+y);
			}

			static void m2()
			{	
				System.out.println("In m2");
				//System.out.println(x + " .... "+y); CE: non-static variable can not be referenced from static context
// we can't access ns variable in static block
				Ex e1 = new Ex();//by using object we are accessing x value
				System.out.println(e1.x + " .... "+e1.y);

				Ex e2 = null;//doubt
				System.out.println(e2.x + " .... "+e2.y);

			}
			public static void main(String[] args) 
			{
				Ex e = new Ex();
				e.m1();
				e.m2();
			}


	

}
