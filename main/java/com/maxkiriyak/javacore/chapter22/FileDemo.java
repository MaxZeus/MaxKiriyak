package main.java.com.maxkiriyak.javacore.chapter22;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileDemo {
    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {


        File f1 = new File("C:\\Users\\godas\\Desktop\\java\\text3.txt");

        p("File name: " + f1.getName());
        p("Path: " + f1.getPath());
        p("Abs Path: " + f1.getAbsolutePath());
        p("Parent: " + f1.getParent());
        p(f1.exists() ? "exists" : "does not exists");
        p(f1.canWrite() ? "is writeable" : "is not writeable");
        p(f1.canRead() ? "is readable" : "is not readable");
        p("is " + (f1.isDirectory() ? "not" : "a directory"));
        p(f1.isFile() ? "is a normal file" : "might be a named pipe");
        p(f1.isAbsolute() ? "is absolute" : "is not absolute");
        p("File last modified:" + f1.lastModified());
        p("File size " + f1.length() + " Bytes");

    }
}
