package main.java.com.maxkiriyak.javacore.chapter30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(7, 18, 10, 24, 17, 5));
        System.out.println("Original list: " + myList);

        Stream<Integer> myStream = myList.stream();
        Optional<Integer> minVal = myStream.min(Integer::compareTo);
        if (minVal.isPresent()) System.out.println("Minimum value: " + minVal.get());

        myStream = myList.stream();
        Optional<Integer> maxValue = myStream.max(Integer::compareTo);
        if(maxValue.isPresent()) System.out.println("Maximum value: " + maxValue.get());

        Stream<Integer> sortedStream = myList.stream().sorted();
        System.out.print("Sorted stream: ");
        sortedStream.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        Stream<Integer> oddVals = myList.stream().filter(n -> n % 2 == 1);
        System.out.print("Odd values: ");
        oddVals.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        oddVals = myList.stream().filter((n) -> n % 2 == 1).filter(n -> n > 5);
        System.out.print("Odds values greater than 5: ");
        oddVals.forEach((n) -> System.out.print(n + " "));
        System.out.println();
    }
}
