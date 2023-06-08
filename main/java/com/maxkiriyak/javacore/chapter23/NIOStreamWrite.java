package main.java.com.maxkiriyak.javacore.chapter23;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NIOStreamWrite {
    public static void main(String[] args) {
        String str = "dksflkhfljashfjashfdkjhsdfkjahf";
        try (OutputStream ous = new BufferedOutputStream(Files.newOutputStream(Path.of("file6.txt"),
                StandardOpenOption.WRITE,
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING))) {


            ous.write(str.getBytes());
        } catch (InvalidPathException | IOException e) {
            e.getCause();
        }
    }
}
