package Polymorphism;

class Multiplier {

    private void multiply(double a, int b) {
        System.out.println("in multiplier 1");
        System.out.println(a * b);
    }

}

class Multiplier2 extends Adder {
    protected void multiply(double a, int b) {
        System.out.println("in multiplier 2");
        System.out.println(a * b);
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Multiplier2 a1 = new Multiplier2();
        a1.multiply(20.0, 11);
    }
}
