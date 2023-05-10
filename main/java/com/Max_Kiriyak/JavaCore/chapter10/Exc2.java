package main.java.com.Max_Kiriyak.JavaCore.chapter10;

public class Exc2 {
    public static void main(String[] args) {
        int d, a;

        try {
            d = 0;
            a = 42 / 0;
            System.out.println("This won't be printed.");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed!!!");
        }
        System.out.println("After catch statement.");
    }
}
