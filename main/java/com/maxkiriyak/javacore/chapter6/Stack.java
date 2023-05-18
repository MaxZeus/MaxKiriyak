package main.java.com.maxkiriyak.javacore.chapter6;

public class Stack {
    int[] stck = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }
    void push(int item) {
        if (tos == 9) System.out.println("Stuck if full.");
        else stck[++tos] = item;
    }
    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else return stck[tos--];
    }

    public static void main(String[] args) {
        Stack st1 = new Stack();
        Stack st2 = new Stack();

        for (int i = 0; i < 10; i++) st1.push(i);
        for (int i = 10; i < 20; i++) st2.push(i);

        System.out.println("Stack in st1");
        for (int i = 0; i < 10; i++) System.out.println(st1.pop());

        System.out.println("Stack in st2");
        for (int i = 0; i < 10; i++) System.out.println(st2.pop());

    }
}
