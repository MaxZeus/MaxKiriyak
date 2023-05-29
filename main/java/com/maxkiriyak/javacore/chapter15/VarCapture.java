package main.java.com.maxkiriyak.javacore.chapter15;

interface MyFuncAgain {
    int func(int n);
}
public class VarCapture {
    public static void main(String[] args) {
        int num = 10;

        MyFuncAgain myLambda = (n) -> {
            return num + n;
        };
    }
}
