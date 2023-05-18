package main.java.com.maxkiriyak.javacore.chapter6;

class BoxC {
    double width;
    double height;
    double depth;

    void volumeToDisplay() {
        System.out.println("Volume is " + (width * height * depth));
    }

    double volumeNum() {
        return width * height * depth;
    }

}
public class BoxDemo3 {
    public static void main(String[] args) {
        BoxC mybox1 = new BoxC();
        BoxC mybox2 = new BoxC();
        double vol;

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        mybox1.volumeToDisplay();
        mybox2.volumeToDisplay();

        System.out.println();

        vol = mybox1.volumeNum();
        System.out.println("Volume is " + vol);

        vol = mybox2.volumeNum();
        System.out.println("Volume is " + vol);

    }
}
