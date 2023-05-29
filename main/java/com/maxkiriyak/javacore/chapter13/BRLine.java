package main.java.com.maxkiriyak.javacore.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRLine {
    public static void main(String[] args) {
        String str = "";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter lines of text");
            System.out.println("Enter 'stop' to quit");
            do {
                str = br.readLine();
                System.out.println(str);
            } while (!str.equals("stop"));
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
