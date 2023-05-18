package main.java.com.maxkiriyak.javacore.chapter20;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");
        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Eta");

        System.out.println(hs);
    }
}
