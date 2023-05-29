package main.java.com.maxkiriyak.javacore.chapter30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class StreamDemo8 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Alpha", "Beta", "Gamma", "Delta", "Phi", "Omega"));
        Stream<String> strL = myList.stream();

        Iterator<String> itr = strL.iterator();
        while (itr.hasNext()) System.out.println(itr.next());
    }
}
