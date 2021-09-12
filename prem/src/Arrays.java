
public class Arrays {

	public static void main(String args[]) {
		int a[]=new int[6];
//		a[0]=0;
//		a[1]=1;
//		a[2]=2;
//		a[3]=3;
//		a[4]=4;
//		a[5]=5;
		int B[]= {1,2,3,4,5,6};
		
		for (int i = 0 ;i<6;i++) {
			a[i]=i;
		}
		for (int i = 0 ;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}
}
