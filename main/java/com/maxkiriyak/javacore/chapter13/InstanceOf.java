package main.java.com.maxkiriyak.javacore.chapter13;

class A {
    int i, j;
}
class B {
    int i, j;
}
class C extends A {
    int k;
}
class D extends A {
    int k;
}
public class InstanceOf {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if (a instanceof A) System.out.println("a is instanceof A");
        if (b instanceof B) System.out.println("b is instanceof B");
        if (c instanceof C) System.out.println("c is instanceof C");
        if (c instanceof A) System.out.println("c can be cast to A");
        if (a instanceof C) System.out.println("a can be cast to C");

        System.out.println();
        A ob;

        ob = d;
        System.out.println("ob now refers to d");
        if (ob instanceof D) System.out.println("ob is instance of D");
        System.out.println();

        ob = c;
        System.out.println("ob now refers to c");
        if (ob instanceof D) System.out.println("ob is instance of D");
        else System.out.println("ob cannot be cast to D");

        if (ob instanceof A) System.out.println("ob can be cast to A");
        System.out.println();
    }
}
