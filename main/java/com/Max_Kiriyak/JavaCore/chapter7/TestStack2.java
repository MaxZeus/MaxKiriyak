package main.java.com.Max_Kiriyak.JavaCore.chapter7;

class StackDemo2 {
    private int[] nums;
    private int tos;

    StackDemo2 (int size) {
        nums = new int[size];
        tos = -1;
    }
    public void push(int i) {
        if (tos == nums.length - 1) System.out.println("Stack is full!");
        else nums[++tos] = i;
    }
    public int pop() {
        if (tos < 0) {
                System.out.println("Stack is underflow!");
            return 0;
        } else return nums[tos--];
    }

}
public class TestStack2 {
    public static void main(String[] args) {
        StackDemo2 stck = new StackDemo2(40);

        for (int i = 0; i < 40; i++) stck.push(i);
        for (int i = 0; i < 40; i++) System.out.println(stck.pop());

    }

}
