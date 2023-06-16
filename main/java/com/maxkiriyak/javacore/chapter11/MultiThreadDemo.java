package main.java.com.maxkiriyak.javacore.chapter11;
class NewThread2 implements Runnable {
    String threadName;
    Thread t;

    public NewThread2(String threadName) {
        this.threadName = threadName;
        t = new Thread(this, this.threadName);
        System.out.println("New Thread: " + t);
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(threadName + " " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Thread interrupted");
        }
        System.out.println(threadName + " exiting.");
    }
}
public class MultiThreadDemo {
    public static void main(String[] args) {
        NewThread2 nt1 = new NewThread2("One");
        NewThread2 nt2 = new NewThread2("Two");
        NewThread2 nt3 = new NewThread2("Three");

        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
