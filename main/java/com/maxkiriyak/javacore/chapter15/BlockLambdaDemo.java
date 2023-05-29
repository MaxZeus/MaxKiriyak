package main.java.com.maxkiriyak.javacore.chapter15;

@FunctionalInterface
interface Numeric {
    int func(int i);
}
public class BlockLambdaDemo {
    public static void main(String[] args) {
        Numeric num = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };
        System.out.println("The factorial of 3 is: " + num.func(3));
        System.out.println("The factorial of 5 is: " + num.func(5));
    }
}
