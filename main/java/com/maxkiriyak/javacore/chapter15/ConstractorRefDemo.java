package main.java.com.maxkiriyak.javacore.chapter15;

interface constFunct {
    MyClass func (int n);
}
class MyClass {
    private int val;
    MyClass(int val) {
        this.val = val;
    }
    int getVal() {return val;}
}
public class ConstractorRefDemo {
    public static void main(String[] args) {
        constFunct consNew = MyClass::new;
        MyClass myClass = consNew.func(10);
        System.out.println(myClass.getVal());
    }
}
