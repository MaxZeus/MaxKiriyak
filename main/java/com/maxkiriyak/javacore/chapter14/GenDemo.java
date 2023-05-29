package main.java.com.maxkiriyak.javacore.chapter14;

class Gen<T> {
    T ob;

    Gen(T ob) {
        this.ob = ob;
    }
    T getOb() {return this.ob;}
    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;

        iOb = new Gen<>(88);
        iOb.showType();

        int v = iOb.getOb();

        System.out.println("value: " + v);
        System.out.println();

        Gen<String> stringGen = new Gen<>("Generics test");
        stringGen.showType();

        String str = stringGen.getOb();
        System.out.println("vale: " + str);
    }

}
