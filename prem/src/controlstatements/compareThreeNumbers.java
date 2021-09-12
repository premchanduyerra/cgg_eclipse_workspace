package controlstatements;

import java.util.Scanner;

public class compareThreeNumbers {

	public void compare() {
		int a;
		int b,c;
		Scanner s=new Scanner(System.in);
		System.out.print("enter 1st number:");
		a=s.nextInt();
		System.out.print("enter 2st number:");
		b=s.nextInt();
		System.out.print("enter 3st number:");
		c=s.nextInt();
		
		if(a<b) {
			if(b<c) {
				System.out.println(c+" is greater");
			}
			else {
				System.out.println(b+" is greater");
			}
		}
		else {
			if(a<c) {
				System.out.println(c+" is greater");
			}
			else {
				System.out.println(a+" is greater");
			}
		}

	}
	
}
