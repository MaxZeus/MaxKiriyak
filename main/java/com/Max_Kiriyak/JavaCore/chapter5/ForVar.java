package main.java.com.Max_Kiriyak.JavaCore.chapter5;

// Parts of the loop can be empty
public class ForVar {
    public static void main(String[] args) {
        int i;
        boolean done = false;

        i = 0;
        for ( ; !done; ) {
            System.out.println("i is " + i);
            if (i == 10) done = true;
            i++;
        }
    }
}
