package main.java.com.maxkiriyak.javacore.chapter23;

import java.io.IOException;
import java.nio.file.*;

public class NIOCopy {
    public static void main(String[] args) {
        try {
            Path source = Path.of("file4.txt");
            Path destination = Path.of("file5.txt");

            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
        } catch (InvalidPathException | IOException e) {
            System.out.println("Error: " + e.getCause());
        }
    }
}
