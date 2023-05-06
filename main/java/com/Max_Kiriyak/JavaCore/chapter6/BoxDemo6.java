package main.java.com.Max_Kiriyak.JavaCore.chapter6;

class BoxF {
    double width;
    double height;
    double depth;

    BoxF () {
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;
    }

}
public class BoxDemo6 {
    public static void main(String[] args) {
        BoxF mybox1 = new BoxF();
        BoxF mybox2 = new BoxF();
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume is " + vol);


    }
}
