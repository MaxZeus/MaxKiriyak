package main.java.com.maxkiriyak.javacore.chapter14;

class Stats<T extends Number> {
    T[] nums;

    Stats(T[] nums) {
        this.nums = nums;
    }
    double average() {
        double sum = 0.0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

}
public class BoundsDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Stats<Integer> iOb = new Stats<Integer>(inums);
        System.out.println("iob average is: " + iOb.average());

        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dOb = new Stats<>(dnums);
        System.out.println("dOn average is: " + dOb.average());
    }
}
