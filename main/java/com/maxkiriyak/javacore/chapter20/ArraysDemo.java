package main.java.com.maxkiriyak.javacore.chapter20;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = -3 * i;
        }

        System.out.print("Original contents: ");
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.print("Sorted: ");
        System.out.println(Arrays.toString(array));

        Arrays.fill(array, 2, 6, -1);
        System.out.print("After fill(): ");
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.print("After sorting again: ");
        System.out.println(Arrays.toString(array));

        System.out.println("The value -9 is at location: " + Arrays.binarySearch(array, -9));
    }
}
