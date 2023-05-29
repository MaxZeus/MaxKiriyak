package main.java.com.maxkiriyak.javacore.chapter15;

import java.util.Arrays;
import java.util.Collections;

interface StringFunct {
    String func(String str);
}
class MyStringIps {
    static String strReverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
public class MethodRefDemo {
    static String stringOP(StringFunct sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;

        outStr = MethodRefDemo.stringOP(MyStringIps::strReverse, inStr);
        System.out.println("Original string: " + inStr);
        System.out.println("Reversed string: " + outStr);
    }
}
