package Interfaces;

abstract class Ex implements Inter {

	public void m1() {
		System.out.println("in m1");
	}
	
	public void m2() {
		System.out.println("in m2");
	}
	
	abstract void m3();
	

}
class  ex2 extends Ex{
	 void m3() {
		System.out.println("in m3");
	}
	public static void main(String args[]) {
		ex2 n=new ex2();
		n.m2();
	}
}
