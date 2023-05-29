package main.java.com.maxkiriyak.javacore.chapter22;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("C:\\Users\\godas\\IdeaProjects\\MaxKiriyak\\src\\main\\java\\com\\maxkiriyak\\javacore\\chapter22\\FileReaderDemo.java")) {
            int c;
            while ((c = fr.read()) != -1) System.out.print((char) c);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
