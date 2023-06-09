package main.java.com.maxkiriyak.javacore.chapter8;

class Box {
    double width;
    double height;
    double depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }
    Box(double len) {
        width = height = depth = len;
    }
    public double volume() {
        return width * height * depth;
    }
}
class BoxWeight extends Box {
    double weight;

    BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }
}
public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);

        System.out.println("Volume of mybox1 is: " + mybox1.volume());
        System.out.println("Weight of mybox1 is: " + mybox1.weight);

        System.out.println();

        System.out.println("Volume of mybox2 is: " + mybox2.volume());
        System.out.println("Weight of mybox2 is: " + mybox2.weight);
    }
}
