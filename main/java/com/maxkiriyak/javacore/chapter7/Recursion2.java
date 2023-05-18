package main.java.com.maxkiriyak.javacore.chapter7;

class RecTest {
    int[] values;

    RecTest(int i) {
        values = new int[i];
    }

    void printArray(int i) {
        if (i == 0) return;
        else printArray(i - 1);
        System.out.println(" [" + (i - 1) + "] " + values[i - 1]);
    }

}
public class Recursion2 {
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);

        for (int j = 0; j < 10; j++) {
            ob.values[j] = j;
        }
        ob.printArray(10);
    }
}
