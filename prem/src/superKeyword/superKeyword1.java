package superKeyword;

class Example {
    static {
        System.out.println("Example loaded");
    }

    void Example1() {
        // super();
        System.out.println("example object created");
    }
}

public class superKeyword1 extends Example {
    static {
        System.out.println("sample loaded");
    }

    void Example1() {
        super.Example1();

        System.out.println("sample object created");
    }

    public static void main(String[] args) {
        System.out.println("in main");
        superKeyword1 s1 = new superKeyword1();
    }
}
