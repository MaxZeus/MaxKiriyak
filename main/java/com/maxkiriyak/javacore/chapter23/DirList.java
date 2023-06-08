package main.java.com.maxkiriyak.javacore.chapter23;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList {
    public static void main(String[] args) {
        String ditname = "./";

        try (DirectoryStream<Path> dirstrim = Files.newDirectoryStream(Path.of(ditname))) {
            System.out.println("Directory of " + ditname);

            for (Path entry : dirstrim) {
                BasicFileAttributes attributes = Files.readAttributes(entry, BasicFileAttributes.class);
                if (attributes.isDirectory()) System.out.print("<DIR>");
                else System.out.print("      ");

                System.out.println(entry.getName(1));
            }
        } catch (InvalidPathException | NotDirectoryException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
