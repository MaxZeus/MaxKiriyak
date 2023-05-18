package main.java.com.maxkiriyak.javacore.chapter4;

// Left shifting as a quick way to multiply by two
// Left shifting a byte value
public class MultByTwo {
    public static void main(String[] args) {
        int i;
        int num = 0xFFFFFFE;

        for (i = 0; i < 4; i++) {
            num <<= 1;
            System.out.println(num);
        }

        System.out.println("\n======================================\n");

        byte a = 64, b;
        int k;

        k = a << 2;
        b = (byte) (a << 2);

        System.out.println("Original value of a: " + a);
        System.out.println("i and b: " + k + " " + b);


    }


}
