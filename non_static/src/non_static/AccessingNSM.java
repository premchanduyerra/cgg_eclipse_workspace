package non_static;

public class AccessingNSM {

	
		int x = 10;
		int y = 20;

		void printXY()
		{
			System.out.println("x: "+x);
			System.out.println("y: "+y);
		}
		public static void main(String[] args) 
		{
			AccessingNSM n1 = new AccessingNSM();
			n1.printXY();//initial values

			AccessingNSM n2 = new AccessingNSM();
			n2.printXY();//initial values

			n1.x = 50;//value changing for n1 obeject
			n1.y = 60;

			System.out.println();

			n1.printXY();//new values will be stored
			n2.printXY();//old values will be there
		
		}
	}
