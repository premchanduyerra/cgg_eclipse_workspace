package non_static;

public class LifeAndScope {

	
		int x = 10;
		int y = 20;

		static void m1()
		{
			System.out.println("In m1");

			LifeAndScope a = new LifeAndScope();
			System.out.println("ls.x: "+a.x);//the scope is in this block only
			System.out.println("ls.y: "+a.y);
		}	

		public static void main(String[] args) 
		{
			System.out.println("In main");
			
			m1();

			//System.out.println("ls.x: "+a.x); will not be executed
			//System.out.println("ls.y: "+a.y);the scope is not in this block

		}
	}
