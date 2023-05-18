package main.java.com.maxkiriyak.javacore.chapter8;

class D {
    D() {
        System.out.println("Inside D's constructor");
    }
}
class E extends D {
    E() {
        System.out.println("Inside E's constructor");
    }
}
class F extends E {
    F() {
        System.out.println("Inside F's constructor");
    }
}
public class CallingCons {
    public static void main(String[] args) {
        F f = new F();
    }
}
