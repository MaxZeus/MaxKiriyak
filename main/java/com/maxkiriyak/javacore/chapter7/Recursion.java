package main.java.com.maxkiriyak.javacore.chapter7;

class Factorial {
    int fact(int n) {
        int result;

        if (n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }
}
public class Recursion {
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.println(fact.fact(3));
    }
}
