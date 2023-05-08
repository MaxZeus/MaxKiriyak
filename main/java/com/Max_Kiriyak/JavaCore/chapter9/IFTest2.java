package main.java.com.Max_Kiriyak.JavaCore.chapter9;

class DunStack implements IntStack {
    private int[] stck;
    private int tos;

    DunStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int i) {
        if (tos == stck.length - 1) {
            int[] temp = new int[stck.length * 2];
            for (int j = 0; j < stck.length; j++) {
                temp[j] = stck[j];
            }
            stck = temp;
            stck[++tos] = i;
        }
        else stck[++tos] = i;
    }
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack is underflow.");
            return 0;
        } else return stck[tos--];
    }
}

public class IFTest2 {
    public static void main(String[] args) {
        DunStack mystack1 = new DunStack(5);
        DunStack mystack2 = new DunStack(8);

        for (int i = 0; i < 12; i++) {
            mystack1.push(i);
        }
        for (int i = 0; i < 20; i++) {
            mystack2.push(i);
        }

        System.out.println("Stack of mystack1: ");
        for (int i = 0; i < 12; i++) {
            System.out.print(mystack1.pop() + " ");
        }
        System.out.println();
        System.out.println("Stack of mystack2: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(mystack2.pop() + " ");
        }
    }
}
