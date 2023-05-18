package main.java.com.maxkiriyak.javacore.chapter20;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

class TComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int i, j, k;

        i = o1.lastIndexOf(" ");
        j = o2.lastIndexOf(" ");

        k = o1.substring(i).compareToIgnoreCase(o2.substring(j));
        if (k == 0) return o1.compareToIgnoreCase(o2);
        else return k;
    }
}
public class TreeMapDemo2 {
    public static void main(String[] args) {

        TreeMap<String, Double> tm = new TreeMap<>(new TComp());

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
