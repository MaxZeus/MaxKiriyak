package main.java.com.Max_Kiriyak.JavaCore.chapter7;

class TestR {
    int a;

    TestR(int i) {
        a = i;
    }
    TestR incrByTen() {
        return new TestR(a + 10);
    }
}
public class RetOb {
    public static void main(String[] args) {
        TestR ob1 = new TestR(2);
        TestR ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a after second increase: " + ob2.a);
    }
}
