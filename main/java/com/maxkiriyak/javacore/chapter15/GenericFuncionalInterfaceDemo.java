package main.java.com.maxkiriyak.javacore.chapter15;

@FunctionalInterface
interface SomeFunc<T> {
    T func (T t);
}
public class GenericFuncionalInterfaceDemo {
    public static void main(String[] args) {
        SomeFunc<String> reverse = (n) -> {
            String result = "";
            for (int i = n.length() - 1; i >= 0; i--) {
                result += n.charAt(i);
            }
            return result;
        };
        System.out.println("You are doing a great job in reverse is : " + reverse.func("You are doing a great job"));
        System.out.println("Go on and don't give up in reverse is : " + reverse.func("Go on and don't give up"));

        SomeFunc<Integer> factorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };
        System.out.println("Factorial of 3 is " + factorial.func(3));
        System.out.println("Factorial of 5 is " + factorial.func(5));

    }
}
