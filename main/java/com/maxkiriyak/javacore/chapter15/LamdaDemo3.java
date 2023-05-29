package main.java.com.maxkiriyak.javacore.chapter15;

interface NumericTest2 {
    boolean test(int n, int d);
}
public class LamdaDemo3 {
    public static void main(String[] args) {
        NumericTest2 num = (n, d) -> n % d == 0;
        if (num.test(10, 2)) System.out.println("2 is a factor of 10");
        if (!num.test(10, 3)) System.out.println("3 isn't a factor of 10");
    }
}
