package main.java.com.maxkiriyak.javacore.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter characters, 'q' to quit.");
            do {
                c = (char) br.read();
                System.out.println(c);
            } while (c != 'q');

    }
}
