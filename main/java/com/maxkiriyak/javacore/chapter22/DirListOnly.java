package main.java.com.maxkiriyak.javacore.chapter22;

import java.io.File;
import java.io.FilenameFilter;

public class DirListOnly {
    public static void main(String[] args) {
        File f1 = new File("C:/Users/godas/Desktop/java/");

        FilenameFilter filter = (a, b) -> b.endsWith("txt");
        String[] s = f1.list(filter);
        assert s != null;
        for (String str : s) {
            System.out.println(str);
        }
    }
}
