package main.java.com.Max_Kiriyak.JavaCore.chapter9.AccessModDem.p2;

import main.java.com.Max_Kiriyak.JavaCore.chapter9.AccessModDem.p1.Protection;

public class Protection2 extends Protection {
    Protection2() {
        System.out.println("Derived other package constructor");

        // System.out.println("n = " + n); class or package only
        // System.out.println("n_pri = " + n_pri); class only

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
