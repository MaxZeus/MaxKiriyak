package main.java.com.maxkiriyak.javacore.chapter9;
interface C {
    void meth1();
    void meth2();
}
interface D extends C {
    void meth3();
}

class MyClass implements D {
    public void meth1() {
        System.out.println("Implement meth1().");
    }

    public void meth2() {
        System.out.println("Implement meth2().");
    }

    public void meth3() {
        System.out.println("Implement meth3().");
    }
}
public class IFExtend {
    public static void main(String[] args) {
        MyClass myclass = new MyClass();

        myclass.meth1();
        myclass.meth2();
        myclass.meth3();
    }
}
