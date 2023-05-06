package main.java.com.Max_Kiriyak.JavaCore.chapter6;

class Box {
    double width;
    double height;
    double depth;
}
public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;

        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        vol = myBox.width * myBox.height * myBox.depth;

        System.out.println("Volume is " + vol);
    }

}
