package main.java.com.maxkiriyak.javacore.chapter7;

class Box {
    double width;
    double height;
    double depth;

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }
    Box(double len) {
        width = height = depth = len;
    }
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    double volume () {
        return width * height * depth;
    }
}
public class OverloadCons {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box(7.0);
        Box mybox3 = new Box(10, 20, 15);

        System.out.println("Volume of mybox1 is " + mybox1.volume());
        System.out.println("Volume of mybox2 is " + mybox2.volume());
        System.out.println("Volume of mybox3 is " + mybox3.volume());
    }

}
