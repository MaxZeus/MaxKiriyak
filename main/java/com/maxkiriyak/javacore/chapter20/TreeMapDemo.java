package main.java.com.maxkiriyak.javacore.chapter20;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap<String, Double> tm = new TreeMap<>();

        tm.put("John Doe", 3434.34);
        tm.put("Tom Smith", 123.22);
        tm.put("Jane Baker", 1378.00);
        tm.put("Tod Hall", 99.22);
        tm.put("Ralph Smith", -19.08);

        for (Map.Entry<String, Double> me : tm.entrySet()) {
            System.out.print(me.getKey() + " ");
            System.out.println(me.getValue());
        }

        System.out.println();

        tm.put("John Doe", tm.get("John Doe") + 1000);
        System.out.println("John Doe's new balance: " + tm.get("John Doe"));
    }
}
