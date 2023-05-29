package main.java.com.maxkiriyak.javacore.chapter14;

import java.util.Arrays;
import java.util.Collections;

interface MinMax <T extends Comparable<T>> {
    T min();
    T max();
}

class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;
    MyClass(T[] vals) {this.vals = vals;}
    @Override
    public T min() {
        return Collections.min(Arrays.asList(vals));
    }

    @Override
    public T max() {
        return Collections.max(Arrays.asList(vals));
    }
}

public class GenIFDemo {
    public static void main(String[] args) {
        Integer[] nums = {3, 6, 2, 8, 6};
        Character[] chs = {'b', 'r', 'p', 'w'};

        MyClass<Integer> class1 = new MyClass<>(nums);
        MyClass<Character> class2 = new MyClass<>(chs);

        System.out.println("class1 min | max: " + class1.min() + " | " + class1.max());
        System.out.println("class2 min | max: " + class2.min() + " | " + class2.max());
    }
}
