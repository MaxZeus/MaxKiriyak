package main.java.com.maxkiriyak.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fous = null;

        if (args.length != 2) {
            System.out.println("Usage: CopyFile from to");
            return;
        }
        try {
            fin = new FileInputStream(args[0]);
            fous = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                if (i != -1) fous.write(i);
            } while (i != -1);

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException e2) {
                System.out.println(e2);
            }
            try {
                if (fous != null) fous.close();
            } catch (IOException e3) {
                System.out.println(e3);
            }
        }
    }
}
