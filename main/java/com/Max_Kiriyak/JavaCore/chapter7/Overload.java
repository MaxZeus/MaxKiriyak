package main.java.com.Max_Kiriyak.JavaCore.chapter7;

class OverloadDemo {
    void test() {
        System.out.println("No parameters.");
    }
    void test(int a) {
        System.out.println("a : " + a);
    }
    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }
    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}
public class Overload {
    public static void main(String[] args) {
        OverloadDemo od = new OverloadDemo();
        double result;

        od.test();
        od.test(10);
        od.test(10, 20);
        result = od.test(123.25);
        System.out.println("Result of od.test(123.25): " + result);
    }

}
