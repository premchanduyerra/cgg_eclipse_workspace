package Inheritance;

class Animal{
	void eat() {
		System.out.println("eating");
	}
}
class dog extends Animal{
	void bark() {
		System.out.println("bark......");
	}
}

class cat extends Animal{
	void meow() {
		System.out.println("meow......");
	}
}

public class MultilevelInheritance {
public static void main(String args[]) {
	cat c=new cat();
	c.eat();
	c.meow();
	c.meow();

}
}
