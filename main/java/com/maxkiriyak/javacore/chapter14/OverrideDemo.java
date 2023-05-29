package main.java.com.maxkiriyak.javacore.chapter14;

class GenG<T> {
    T ob;

    public GenG(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        System.out.print("GenG's getOb(): ");
        return ob;
    }
}
class GenG2<T> extends GenG<T> {

    public GenG2(T ob) {
        super(ob);
    }
    public T getOb() {
        System.out.print("GenG2's getOb(): ");
        return ob;
    }
}
public class OverrideDemo {
    public static void main(String[] args) {
        GenG<Integer> iOb = new GenG<>(88);
        GenG2<Integer> iOb2 = new GenG2<>(99);
        GenG2<String> strOb = new GenG2<>("Как же я заебался!!!!!");

        System.out.println(iOb.getOb());
        System.out.println(iOb2.getOb());
        System.out.println(strOb.getOb());
    }
}
