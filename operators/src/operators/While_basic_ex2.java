package operators;

import java.util.Scanner;

public class While_basic_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the limit");
		int num=s.nextInt();
		int i=0;
		while( i<=num)
		{
			System.out.println(i);
			i=i+2;
		}
	}

}
