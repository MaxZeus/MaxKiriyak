package main.java.com.Max_Kiriyak.JavaCore.chapter8;
abstract class Ab {
    abstract void callme();
    void callmetoo() {
        System.out.println("This is a concrete method.");
    }
}
class Bc extends Ab {
    void callme() {
        System.out.println("B's implementation of callme");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        Bc bc = new Bc();

        bc.callme();
        bc.callmetoo();
    }
}
