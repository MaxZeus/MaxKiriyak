package main.java.com.maxkiriyak.javacore.chapter13;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
            pw.println("This is a string");
            pw.println(-7);
            pw.println(4.5e-7);
    }
}
