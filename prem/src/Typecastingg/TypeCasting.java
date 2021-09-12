package Typecastingg;

public class TypeCasting {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 12982.32;
        System.out.println("converswion of int to byte:");
        b = (byte) i;
        System.out.println("b:" + b + ",i:" + i);

        System.out.println("converswion of double to int:");
        i = (int) d;
        System.out.println("d:" + d + ",i:" + i);

        System.out.println("converswion of double to byte:");
        b = (byte) d;
        System.out.println("b:" + b + ",d:" + d);
    }
}
