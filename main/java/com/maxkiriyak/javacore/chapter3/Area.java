package main.java.com.maxkiriyak.javacore.chapter3;

// Compute the area of a circle
public class Area {
    public static void main(String[] args) {
        double pi, r, a;

        r = 10.8; // radius of circle
        pi = 3.14; // pi, approximately
        a = pi * Math.pow(r, 2); // compute area

        System.out.println("Area of circle is " + a);
    }
}
