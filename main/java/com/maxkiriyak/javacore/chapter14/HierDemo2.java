package main.java.com.maxkiriyak.javacore.chapter14;

class NonGen1 {
    int num;
    NonGen1(int i) {
        num = i;
    }
    int getNum() {
        return num;
    }
}

class GenT<T> extends NonGen1 {
    T ob;
    GenT(T ob, int i) {
        super(i);
        this.ob = ob;
    }
    T getOb() {
        return this.ob;
    }
}
public class HierDemo2 {
    public static void main(String[] args) {
        GenT<String> gent = new GenT<>("Hello agent: ", 47);
        System.out.print(gent.getOb());
        System.out.println(gent.getNum());
    }
}
