package main.java.com.maxkiriyak.javacore.chapter30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>(Arrays.asList(1.1, 3.6, 9.2, 4.7, 12.1, 5.0));
        System.out.println("Original values in myList: ");
        arrayList.forEach(a -> System.out.print(a + " "));
        System.out.println();

        IntStream cStrm = arrayList.stream().mapToInt((a) -> (int) Math.ceil(a));
        System.out.println("the ceilings of the values in myList: ");
        cStrm.forEach(a -> System.out.print(a + " "));

    }
}
