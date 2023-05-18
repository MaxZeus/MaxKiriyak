package main.java.com.maxkiriyak.javacore.chapter6;

class BoxE {
    double width;
    double height;
    double depth;
}
public class BoxDemo2 {
    public static void main(String[] args) {
        BoxE mybox1 = new BoxE();
        BoxE mybox2 = new BoxE();
        double vol;

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Volume is " + vol);

        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Volume is " + vol);


    }
}
