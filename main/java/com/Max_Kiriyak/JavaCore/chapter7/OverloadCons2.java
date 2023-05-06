package main.java.com.Max_Kiriyak.JavaCore.chapter7;
class BoxN {
    double width;
    double height;
    double depth;

    BoxN() {
        width = -1;
        height = -1;
        depth = -1;
    }
    BoxN(double len) {
        width = height = depth = len;
    }
    BoxN(BoxN box) {
        width = box.width;
        height = box.height;
        depth = box.depth;
    }
    BoxN(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    double volume () {
        return width * height * depth;
    }
}
public class OverloadCons2 {
    public static void main(String[] args) {
       BoxN mybox1 = new BoxN();
       BoxN mybox2 = new BoxN(7);
       BoxN mybox3 = new BoxN(10, 20, 15);

       BoxN myclone = new BoxN(mybox3);

       System.out.println("Volume of mybox1 is " + mybox1.volume());
       System.out.println("Volume of mybox2 is " + mybox2.volume());
       System.out.println("Volume of mybox3 is " + mybox3.volume());
       System.out.println("Volume of myclome is " + myclone.volume());
    }
}
