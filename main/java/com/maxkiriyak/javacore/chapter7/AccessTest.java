package main.java.com.maxkiriyak.javacore.chapter7;

class TestA {
    int a;
    public int b;
    private int c;

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
public class AccessTest {
    public static void main(String[] args) {
        TestA ob = new TestA();

        ob.a = 10;
        ob.b = 20;

        // ob.c = 100
        ob.setC(100);
        System.out.println("a, b and c: " + ob.a + " " + ob.b + " " + ob.getC());
    }
}
