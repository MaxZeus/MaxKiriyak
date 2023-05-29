package main.java.com.maxkiriyak.javacore.chapter30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>(Arrays.asList(
                new NamePhoneEmail("Larry", "555-5555", "Larry@HerbShildt.com"),
                new NamePhoneEmail("James", "555-4444", "James@HerbShildt.com"),
                new NamePhoneEmail("Mary", "555-3333", "Mary@HerbShildt.com")
        ));

        Stream<NamePhone> nameAndPhone = myList.stream().map((a) -> new NamePhone(a.name, a.phoneNum));
        List<NamePhone> list = nameAndPhone.collect(Collectors.toList());
        System.out.println("Names and phone numbers in a List: ");
        list.forEach(a -> System.out.println(a.name + " " + a.phoneNum));

        nameAndPhone = myList.stream().map(a -> new NamePhone(a.name, a.phoneNum));
        Set<NamePhone> set = nameAndPhone.collect(Collectors.toSet());
        System.out.println("\nNames and phone numbers in a Set:");
        set.forEach(namePhone -> System.out.println(namePhone.name + " " + namePhone.phoneNum));

    }
}
