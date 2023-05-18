package main.java.com.maxkiriyak.javacore.chapter5;

// Use for-each style for loop.
public class ForEach {
    public static void main(String[] args) {
        int sum = 0;
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // use for-each style for to display and sum the values
        for (int x : nums) {
            System.out.println("Value is: " + x);
            sum += x;
        }
        System.out.println("Summation: " + sum);
    }
}
