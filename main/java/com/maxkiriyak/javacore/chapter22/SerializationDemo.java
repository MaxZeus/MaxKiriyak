package main.java.com.maxkiriyak.javacore.chapter22;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        try (ObjectOutputStream objOStrm = new ObjectOutputStream(new FileOutputStream("serial"))) {
            MyClass object1 = new MyClass("Hello", -7, 2.7e10);
            System.out.println("object1: " + object1);

            objOStrm.writeObject(object1);
        } catch (IOException e) {
            System.out.println(e);
        }

        try (ObjectInputStream objIStr = new ObjectInputStream(new FileInputStream("serial"))) {
            MyClass object2 = (MyClass) objIStr.readObject();
            System.out.println("Object2: " + object2);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
class MyClass implements Serializable {
    String s;
    int i;
    double d;

    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "s='" + s + '\'' +
                ", i=" + i +
                ", d=" + d +
                '}';
    }
}
