package Polymorphism;

class ReturnType1 {
    public void m1(int a, int b) {
        System.out.println(a * b);
    }

    public int m11(int c, int d) {
        System.out.println(c * d);
        return d;
    }
}

public class MethodoverloadingReturn {
    public static void main(String[] args) {
        ReturnType1 r1 = new ReturnType1();
        r1.m1(1, 2);
        r1.m11(1, 2);
        r1.m11(1, 2);
    }
}
