package main.java.com.maxkiriyak.javacore.chapter23;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        try (InputStream fin = Files.newInputStream(Path.of("file4.txt"), StandardOpenOption.READ)) {
            do {
                if ((i = fin.read()) != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (InvalidPathException | IOException e) {
            e.getCause();
        }
    }
}
