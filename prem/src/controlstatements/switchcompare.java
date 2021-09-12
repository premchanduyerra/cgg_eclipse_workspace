package controlstatements;

import java.util.Scanner;

public class switchcompare {

	public void switchcompare() {
		int a,b;
		char operator;
		Scanner s=new Scanner(System.in);
		System.out.print("enter 1st number:");
		a=s.nextInt();
		System.out.print("enter 2st number:");
		b=s.nextInt();
		System.out.print("operation + or - or % or /");
		operator=s.next().charAt(0);
		switch(operator) {
		case '+':System.out.print("sum:"+(a+b));
					break;
		case '-':System.out.print("sub:"+(a-b));
					break;
		case '/':System.out.print("div:"+(a/b));
					break;
		case '%':System.out.print("mod:"+(a%b));
					break;
		default:System.out.print("OOPS!:");
		}
	}

}
