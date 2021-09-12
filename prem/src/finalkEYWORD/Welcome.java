package finalkEYWORD;

class P {
    int a = 10;
    final int b = 20;

    final void ma() {
        System.out.println("hhh");
    }
}

final class P1 {
    int a = 10;
    final int b = 20;

    void ma() {
        System.out.println("hhh");
    }
}

public class Welcome extends P {

    public static void main(String[] args) {
        // TODO Auto-generated method
        System.out.println("");

        P1 ob = new P1();

        ob.ma();

    }

}
