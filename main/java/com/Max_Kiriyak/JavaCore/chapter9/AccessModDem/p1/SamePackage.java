package main.java.com.Max_Kiriyak.JavaCore.chapter9.AccessModDem.p1;

public class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("SamePackage constructor");
        System.out.println("n = " + p.n);

        //System.out.println("n_pri = " + p.n_pri); class only

        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
