package non_static;

public class Example {

	
		int x;
		int y;

		void m1()
		{
			x = 50;
			y = 60;
		}

		void m2()
		{
			Example e = new Example();
			e.x = 70;
			e.y = 80;
			System.out.println(e.x);// to print the updated values
			// we need to call by the object 
			//e.x and x are different 
			System.out.println(e.y);
		}

		void printXY()
		{
			System.out.println("x: "+x);
			System.out.println("y: "+y);
		}

		public static void main(String[] args) 
		{
			Example e = new Example();

			System.out.println("x,y before methods call");
			e.printXY();//no values assigned

			e.m1();
			System.out.println("x,y after m1() method call");
			e.printXY(); // values assigned 50 and 60

			e.m2();
			System.out.println("x,y after m2() method call");
			e.printXY();//same values are printed bacause we are
			//creating a different object in m2 method

		}
	}
