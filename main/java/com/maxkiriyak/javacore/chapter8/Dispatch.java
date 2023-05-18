package main.java.com.maxkiriyak.javacore.chapter8;
class X {
    void callme() {
        System.out.println("Inside X's callme method");
    }
}
class Y extends X {
    void callme() {
        System.out.println("Inside Y's callme method");
    }
}
class Z extends Y {
    void callme() {
        System.out.println("Inside Z's callme method");
    }
}
public class Dispatch {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        Z z = new Z();
        X r;

        r = x;
        r.callme();

        r = y;
        r.callme();

        r = z;
        z.callme();
    }
}
