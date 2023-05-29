package main.java.com.maxkiriyak.javacore.chapter15;

@FunctionalInterface
interface StringFunc {
    String func(String n);
}
public class BlockLambdaDemo2 {
    public static void main(String[] args) {
        StringFunc reverse = (str) -> {
            String result = "";
            for (int i = str.split("").length - 1; i >= 0; i--) {
               result += str.split("")[i];
            }
            return result;
        };
        System.out.println("Lambda reversed is " + reverse.func("Lambda"));
        System.out.println("Expression reversed is " + reverse.func("Expression"));
    }
}
