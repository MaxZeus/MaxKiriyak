package main.java.com.maxkiriyak.javacore.chapter22;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;

        try (FileInputStream fin = new FileInputStream("/C:/Users/godas/Desktop/java/text3.txt")) {
            System.out.println("Total Available Bytes: " + (size = fin.available()));
            int n = size / 20;

            System.out.println("First " + n + " bytes of the file one read() at a time");
            for (int i = 0; i < n; i++) {
                System.out.print((char) fin.read());
            }
            System.out.println("\nStill Available: " + fin.available());
            System.out.println("Reading the next " + n + " with one read(b[])");
            byte[] b = new byte[n];
            if (fin.read(b) != n) System.err.println("couldn't read " + n + " bytes");

            System.out.println(new String(b, 0, n));
            System.out.println("\nStill Available " + (size = fin.available()));
            System.out.println("Skipping half of remaining bytes with skip()");
            fin.skip(size / 2);
            System.out.println("Still available" + fin.available());
            System.out.println("Reading " + n / 2 + " into the end of array");
            if (fin.read(b, n / 2, n / 2) != n / 2) System.err.println("couldn't read " + n / 2 + " bytes");

            System.out.println(new String(b , 0, b.length));
            System.out.println("\nStill available: " + fin.available());

        } catch (IOException e) {
            System.out.println(e);
        }



    }
}
