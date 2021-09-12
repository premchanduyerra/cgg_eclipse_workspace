package superKeyword;

class P {
    private void m1() {
        System.out.println("p m1");
    }
}

class Q extends P {
    void m1() {
        System.out.println("Q m1");
    }
}

class R extends P {
    void m1() {
        System.out.println("R m1");
    }
}

class S extends P {
    protected void m1() {
        System.out.println("S m1");
    }
}

class T extends P {
    public void m1() {
        System.out.println("T m1");
    }
}

public class modifiersSuper extends P {
    public static void main(String[] args) {
        T t1 = new T();
        t1.m1();

    }
}
