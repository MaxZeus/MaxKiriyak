package main.java.com.maxkiriyak.javacore.chapter15;

interface YourFunct <T> {
    boolean func (T v1, T v2);
}
class HighTemp {
    private int hTemp;
    HighTemp(int hTemp) {this.hTemp = hTemp;}

    boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }
    boolean lessThanTemp(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}
public class InstanceMethWithObjectFerDemo {
    static <T> int counter(T[] vals, YourFunct<T> f, T v) {
        int count = 0;
        for (T val : vals) {
            if (f.func(val, v)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int count;
        HighTemp[] weekDaysHighT = {
                new HighTemp(89), new HighTemp(82),
                new HighTemp(90), new HighTemp(89),
                new HighTemp(89), new HighTemp(91),
                new HighTemp(84), new HighTemp(83)
        };
        count = counter(weekDaysHighT, HighTemp::sameTemp, new HighTemp(89));
        System.out.println(count + " days had a high of 89");

        HighTemp[] weekDaysHighT2 = {
                new HighTemp(32), new HighTemp(12),
                new HighTemp(24), new HighTemp(19),
                new HighTemp(18), new HighTemp(12),
                new HighTemp(-1), new HighTemp(13)
        };
        count = counter(weekDaysHighT2, HighTemp::sameTemp, new HighTemp(12));
        System.out.println(count + " days had a high of 12");

        count = counter(weekDaysHighT, HighTemp::lessThanTemp, new HighTemp(89));
        System.out.println(count + " days had a high less than 89");

        count = counter(weekDaysHighT2, HighTemp::lessThanTemp, new HighTemp(19));
        System.out.println(count + " days had a high less than 19");
    }
}
