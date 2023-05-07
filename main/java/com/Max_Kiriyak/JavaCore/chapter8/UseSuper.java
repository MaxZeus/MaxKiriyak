package main.java.com.Max_Kiriyak.JavaCore.chapter8;

class Aaa {
    int i;
}
class Bbb extends Aaa {
    int i;

    Bbb(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}
public class UseSuper {
    public static void main(String[] args) {
        Bbb subOb = new Bbb(1, 2);
        subOb.show();

    }
}
