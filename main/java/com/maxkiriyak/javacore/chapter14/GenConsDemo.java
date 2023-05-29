package main.java.com.maxkiriyak.javacore.chapter14;

class GenCons {
    private double val;

    <T extends Number> GenCons(T args) {
        val = args.doubleValue();
    }
    void showVal() {
        System.out.println("val: " + val);
    }
}
public class GenConsDemo {
    public static void main(String[] args) {
        GenCons test = new GenCons(100);
        GenCons test1 = new GenCons(123.5F);
        test.showVal();
        test1.showVal();
    }
}
