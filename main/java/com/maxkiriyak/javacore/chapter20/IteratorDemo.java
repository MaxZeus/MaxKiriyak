package main.java.com.maxkiriyak.javacore.chapter20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add("G");

        System.out.print("Original contents of al: ");
        Iterator<String> itr = al.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        ListIterator<String> listIterator = al.listIterator();
        while (listIterator.hasNext()) {
            listIterator.set((listIterator.next() + "+"));
        }

        System.out.print("Modified contents of al: ");
        itr = al.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        System.out.print("Modified list backwards: ");
        while(listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println();
    }
}
