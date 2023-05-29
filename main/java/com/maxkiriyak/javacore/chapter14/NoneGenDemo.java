package main.java.com.maxkiriyak.javacore.chapter14;

class NonGen {
    Object ob;

    NonGen(Object ob) {
        this.ob = ob;
    }
    Object getObject() {
        return ob;
    }
    void showType() {
        System.out.println("type of ob is " + ob.getClass().getName());
    }
}
public class NoneGenDemo {
    public static void main(String[] args) {
        NonGen iOb  = new NonGen(88);
        iOb.showType();

        int v = (Integer) iOb.getObject();
        System.out.println("value: " + v);
        System.out.println();

        NonGen strOb = new NonGen("Non Generics Test.");
        strOb.showType();

        String str = (String) strOb.getObject();
        System.out.println("value: " + str);

        iOb = strOb;
        v = (Integer) iOb.getObject();
    }
}
