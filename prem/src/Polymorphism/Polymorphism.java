package Polymorphism;

class Adder {
	//
	// static int add(int a,int b) {return a+b;}
	// static double add(double a,double b) {return a+b;}

	void multiply(int a, double b) {
		System.out.println(a * b);
	}

	void multiply(double a, int b) {
		System.out.println(a * b);
	}

}

class Adder2 extends Adder {
	void multiply(double a, int b) {
		System.out.println("inadder2");
		System.out.println(a * b);
	}
}

public class Polymorphism {

	public static void main(String[] args) {

		Adder2 a1 = new Adder2();
		a1.multiply(20.0, 11);
	}

}