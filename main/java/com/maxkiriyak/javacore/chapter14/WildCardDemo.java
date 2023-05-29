package main.java.com.maxkiriyak.javacore.chapter14;

class Stats2<T extends Number> {
    T[] nums;

    Stats2(T[] nums) {
        this.nums = nums;
    }

    double average() {
        double sum = 0.0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }
    boolean isAverage(Stats2<?> ob) {
        return this.average() == ob.average();
    }
}
public class WildCardDemo {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        Stats2<Integer> iOb = new Stats2<>(nums);
        System.out.println("ion average is :" + iOb.average());

        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats2<Double> dOb = new Stats2<>(dnums);
        System.out.println("dOb average is :" + dOb.average());

        Float[] fnums = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats2<Float> fOb = new Stats2<>(fnums);
        System.out.println("fOb average is :" + fOb.average());

        System.out.println("Averages of iOb and dOb " + iOb.isAverage(dOb));
        System.out.println("Averages of iOb and fOb " + iOb.isAverage(fOb));
    }
}
