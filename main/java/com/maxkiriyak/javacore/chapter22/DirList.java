package main.java.com.maxkiriyak.javacore.chapter22;

import java.io.File;

public class DirList {
    public static void main(String[] args) {
        String dirName = "C:/Users/godas/Desktop/java/";
        File f1 = new File(dirName);

        if (f1.isDirectory()) {
            System.out.println("Directory of " + dirName);
            String[] s = f1.list();

            for (String str : s) {
                File f = new File(dirName + "/" + str);
                if (f.isDirectory()) {
                    System.out.println(str + " is a directory");
                } else {
                    System.out.println(str + " is a file");
                }
            }
        } else {
            System.out.println(dirName + " is not a directory");
        }
    }
}
