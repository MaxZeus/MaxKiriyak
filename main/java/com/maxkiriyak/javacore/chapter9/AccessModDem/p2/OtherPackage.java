package main.java.com.maxkiriyak.javacore.chapter9.AccessModDem.p2;

import main.java.com.maxkiriyak.javacore.chapter9.AccessModDem.p1.Protection;

public class OtherPackage {
    OtherPackage() {
        Protection p = new Protection();
        System.out.println();

        // System.out.println("n = " + p.n); class or package only
        // System.out.println("n_pri = " + p.n_pri); class only
        // System.out.println("n_pro = " + p.n_pro); class, subclass or package only

        System.out.println("n_pub = " + p.n_pub);
    }
}
