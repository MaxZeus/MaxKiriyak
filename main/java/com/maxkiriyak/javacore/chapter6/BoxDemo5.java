package main.java.com.maxkiriyak.javacore.chapter6;

class BoxD {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
public class BoxDemo5 {
    public static void main(String[] args) {
        BoxD mybox1 = new BoxD();
        BoxD mybox2 = new BoxD();
        double vol;

        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume is " + vol);


    }
}
