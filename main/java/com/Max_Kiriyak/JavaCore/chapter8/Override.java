package main.java.com.Max_Kiriyak.JavaCore.chapter8;

class G {
    int i, j;
    G(int i, int j) {
        this.i = i;
        this.j = j;
    }
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}
class J extends G {
    int k;
    J(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }
    void show() {
        super.show();
        System.out.println("and k: " + k);
    }

}
public class Override {
    public static void main(String[] args) {
        J subOb = new J(3, 7, 45);
        subOb.show();
    }
}
