package main.java.com.Max_Kiriyak.JavaCore.chapter8;

class Aa {
    int i;
    private int j;

    void setij(int i, int j) {
        this.i = i;
        this.j = j;
    }
}
class Bb extends Aa {
    int total;

    void sum() {
        //total = i + j; // ERROR, j is not accessible here
    }
}
public class Access {
    public static void main(String[] args) {
        Bb subOb = new Bb();

        subOb.setij(5, 7);
        subOb.sum();
        System.out.println("Total is " + subOb.total);
    }

}
