package main.java.com.maxkiriyak.javacore.chapter22;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileWriterDemo {
    public static void main(String[] args) {
        String source = "Now is the time for all good\n" +
                " to come to the aid of their countrey\n" +
                " and pay their due taxes.";
        char[] buffer = new char[source.length()];
        source.getChars(0, source.length(), buffer, 0);

        try (FileWriter fw1 = new FileWriter("file1.txt");
             FileWriter fw2 = new FileWriter("file2.txt");
             FileWriter fw3 = new FileWriter("file3.txt")) {

            for (int i = 0; i < buffer.length; i+= 2) {
                fw1.write(buffer[i]);
            }
            fw2.write(buffer);
            fw3.write(buffer, buffer.length - buffer.length / 4, buffer.length / 4);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
