package main.java.com.Max_Kiriyak.JavaCore.chapter8;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();

        System.out.println("Volume of weightbox is: " + weightbox.volume());
        System.out.println("Weight of weightbox is: " + weightbox.weight);

        System.out.println();

        plainbox = weightbox;
        System.out.println("Volume of plainbox is: " + plainbox.volume());
        //System.out.println("Weight of plainboxbox is: " + plainbox.weight);

    }
}
