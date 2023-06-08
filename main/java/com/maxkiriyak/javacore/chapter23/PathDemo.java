package main.java.com.maxkiriyak.javacore.chapter23;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class PathDemo {
    public static void main(String[] args) {
        Path filepath = Path.of("./file1.txt");
        System.out.println("File name: " + filepath.getName(1));
        System.out.println("Path: " + filepath);
        System.out.println("Absolute path: " + filepath.toAbsolutePath());
        System.out.println("Parent: " + filepath.getParent());

        if (Files.exists(filepath)) System.out.println("File exists");
        else System.out.println("File doesn't exists");

        try {
            if (Files.isHidden(filepath)) System.out.println("File is hidden");
            else System.out.println("file is not hidden");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        if (Files.isWritable(filepath)) System.out.println("File is writable");
        if (Files.isReadable(filepath)) System.out.println("File is readable");

        try {
            BasicFileAttributes attrubs = Files.readAttributes(filepath, BasicFileAttributes.class);

            if (attrubs.isDirectory()) System.out.println("The file is a directory");
            else System.out.println("The file isn't a directory");

            if (attrubs.isRegularFile()) System.out.println("The file is a normal file");
            else System.out.println("The file isn't a normal file");

            if (attrubs.isSymbolicLink()) System.out.println("The file is a symbolic link");
            else System.out.println("The file is not a symbolic link");

            System.out.println("File last modified: " + attrubs.lastModifiedTime());
            System.out.println("File size: " + attrubs.size() + " Bytes");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
