package exceptions;

class e1 {
    public static void m1() throws InterruptedException {
        throw new InterruptedException("Interrupted exception in m1");
    }

    public static void m2() throws ArithmeticException {
        throw new ArithmeticException(" Arithmetic exception in m2");

    }

    public static void main(String[] args) {
        try {
            m1();
        } catch (InterruptedException Ie) {
            System.out.println(Ie.getMessage());
            try {
                m2();
            } catch (ArithmeticException ae) {
                System.out.println(ae.getMessage());
            }
        }
    }
}
