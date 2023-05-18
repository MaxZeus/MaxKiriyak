package main.java.com.maxkiriyak.javacore.chapter20;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(-8, 20, -20, 8));

        Collections.sort(ll, Collections.reverseOrder());
        System.out.println(ll);

        Collections.shuffle(ll);
        System.out.println(ll);

        System.out.println("Collections.max: " + Collections.max(ll));
        System.out.println("Collections.min: " + Collections.min(ll));

    }
}
