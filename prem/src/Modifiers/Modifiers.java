package Modifiers;

import AnotherModifier.AnotherModifier;

class Const {

	private Const() {
		System.out.println("in private const");
	}
}

public class Modifiers extends AnotherModifier {
	public static void main(String args[]) {
		// p.name=""//cannot acces
		// Const am = new Const();

	}
}
