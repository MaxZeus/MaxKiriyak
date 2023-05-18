package main.java.com.maxkiriyak.javacore.chapter9;

interface IntStack {
    void push(int x);
    int pop();
}
class FixedStack implements IntStack {
    private int[] stck;
    private int tos;

    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int i) {
        if (tos == stck.length - 1) System.out.println("Stack is full.");
        else stck[++tos] = i;
    }
    public int pop() {
        if (tos < 0) { System.out.println("Stack is underflow."); return 0;}
        else return stck[tos--];
    }
}
public class IFTest {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);

        for (int i = 0; i < 5; i++) {
            mystack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            mystack2.push(i);
        }

        System.out.println("Stack of mystack1: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(mystack1.pop() + " ");
        }
        System.out.println();
        System.out.println("Stack of mystack2: ");
        for (int i = 0; i < 8; i++) {
            System.out.print(mystack2.pop() + " ");
        }
    }
}
