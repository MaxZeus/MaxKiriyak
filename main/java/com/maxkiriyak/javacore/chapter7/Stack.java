package main.java.com.maxkiriyak.javacore.chapter7;

public class Stack {
    private int[] stck = new int[10];
    private int tos;

    Stack() {
        tos = -1;
    }
    public void push(int i) {
        if (tos == 9) System.out.println("Stack is full!!!");
        else stck[++tos] = i;
    }
    public int pop() {
        if (tos < 0) {
            System.out.println("Stuck is underflow");
            return 0;
        }
        else return stck[tos--];
    }
    public void fillStck() {
        for (int i = 0; i < 10; i++) {
            push(i);
        }
    }


    public static void main(String[] args) {
        Stack stck = new Stack();
        stck.fillStck();
        for (int i = 0; i < 10; i++) {
            System.out.println(stck.pop());
        }

    }
}
