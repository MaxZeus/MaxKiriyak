package main.java.com.maxkiriyak.javacore.chapter15;

@FunctionalInterface
interface MyNumber<T> {
    T getVaue();
}
@FunctionalInterface
interface NumericTest {
    boolean isEven(int n);
}
public class LamdaDemo {
    public static void main(String[] args) {
        MyNumber<Double> myNum = () -> 123.45;
        System.out.println("Fixed value: " + myNum.getVaue());
        MyNumber<Integer> myNum2 = () -> (int) (Math.random() * 10);

        System.out.println("Random value: " + myNum2.getVaue());
        System.out.println("Random value: " + myNum2.getVaue());
        System.out.println("---------------------------------------------");
        NumericTest numericTest = (n) -> n % 2 == 0;
        System.out.println(numericTest.isEven(2));
        System.out.println(numericTest.isEven(5));
        System.out.println(numericTest.isEven(6));
        System.out.println(numericTest.isEven(11));



    }
}
