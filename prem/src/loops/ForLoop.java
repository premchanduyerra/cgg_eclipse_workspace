package loops;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i=0;i<=2;i++) {
//			for(int j=0;j<=2;j++) {
//				if(i==j) 
//					continue;
//				System.out.println("( "+i+","+j+" )");
//			}
//			
//		}
			
			int k=0,l=0;
			while(k<3) {
				l=0;
				while(l<3) {
					System.out.println("( "+k+","+l+" )");
					l++;
				}
				k++;
			}
		
	}

}
