package main.java.com.maxkiriyak.javacore.chapter30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(7, 18, 10, 24, 17, 5));
        Optional<Integer> productObj = myList.stream().reduce((a, b) -> a * b);
        if (productObj.isPresent()) System.out.println("Product as Optional: " + productObj.get());

        int product = myList.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Product as int (identity is 1): "+ product);

        int product2 = myList.stream().reduce(2, (a, b) -> a * b);
        System.out.println("Product2 as int (identity is 2): " + product2);

        int product3 = myList.stream().reduce(3, (a, b) -> a * b);
        System.out.println("Product3 as int (identity is 3): " + product3);
    }
}
