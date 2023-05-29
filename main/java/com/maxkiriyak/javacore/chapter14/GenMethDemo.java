package main.java.com.maxkiriyak.javacore.chapter14;

public class GenMethDemo {
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (V v : y) {
            if (x.equals(v)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        if (isIn(2, nums)) System.out.println("2 is in nums");
        if (!isIn(7, nums)) System.out.println("7 in not in nums");

        System.out.println();

        String[] str = {"one", "two", "three", "four", "five"};
        if (isIn("two", str)) System.out.println("two is in str[]");
        if (!isIn("seven", str)) System.out.println("seven is not in str[]");
    }
}
