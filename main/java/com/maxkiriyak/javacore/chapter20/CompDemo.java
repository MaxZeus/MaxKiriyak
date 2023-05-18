package main.java.com.maxkiriyak.javacore.chapter20;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

class MyComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}

public class CompDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(new MyComp());
        TreeSet<String> ts2 = new TreeSet<>(Comparator.reverseOrder());

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        System.out.println(ts);

        ts2.add("C");
        ts2.add("A");
        ts2.add("B");
        ts2.add("E");
        ts2.add("F");
        ts2.add("D");

        System.out.println(ts2);

    }
}
