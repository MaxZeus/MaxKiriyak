package main.java.com.maxkiriyak.javacore.chapter22;

import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console con = System.console();;

        str = con.readLine("Enter a string: ");
        con.printf("Here is your string %s\n", str);


       // if (con == null) return;


    }
}
