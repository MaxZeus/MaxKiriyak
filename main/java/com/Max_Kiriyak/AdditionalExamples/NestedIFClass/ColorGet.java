package main.java.com.Max_Kiriyak.AdditionalExamples.NestedIFClass;

import java.security.cert.TrustAnchor;

interface Colorable {
    public Color getColor();

    public static class Color {
        private int red, green, blue;
        Color(int red, int green, int blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }

        int getRed() {return red;}
        int getGreen() {return green;}
        int getBlue() {return blue;}
    }
}
class Triangle implements Colorable {
    private Color color;

    Triangle(int red, int green, int blue) {
        color = new Colorable.Color(red, green, blue);
    }
    @Override
    public Color getColor() {
        return color;
    }
}
public class ColorGet {
    public static void main(String[] args) {
        Colorable.Color cc = new Colorable.Color(5, 5, 5);
        cc = new Triangle.Color(71, 45, 32);

        Triangle tre = new Triangle(12, 547, 32);
        cc = tre.getColor();
        System.out.println(cc.getRed() + " " + cc.getGreen() + " " + cc.getBlue());
    }
}
