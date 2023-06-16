package main.java.com.maxkiriyak.javacore.chapter11;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t);
        System.out.println("Name of the current thread: " + t.getName());

        t.setName("My Thread");
        System.out.println("After name change: " + t);
        System.out.println("Name of the changed thread: " + t.getName());

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}
