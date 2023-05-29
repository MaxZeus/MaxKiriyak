package main.java.com.maxkiriyak.javacore.chapter30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

class NamePhoneEmail {
    String name;
    String phoneNum;
    String email;

    NamePhoneEmail (String name, String phoneNum, String email) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
    }
}
class NamePhone {
    String name;
    String phoneNum;

    NamePhone(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }
}
public class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>(Arrays.asList(
                new NamePhoneEmail("Larry", "555-5555", "Larry@HerbShildt.com"),
                new NamePhoneEmail("James", "555-4444", "James@HerbShildt.com"),
                new NamePhoneEmail("Mary", "555-3333", "Mary@HerbShildt.com")
        ));
        System.out.println("Original values in myList: ");
        myList.forEach(a -> System.out.println(a.name + " " + a.phoneNum + " " + a.email));
        System.out.println();

        Stream<NamePhone> nameAndPhone = myList.stream().map(a -> new NamePhone(a.name, a.phoneNum));
        System.out.println("List of names and phone numbers: ");
        nameAndPhone.forEach(a -> System.out.println(a.name + " " + a.phoneNum));
    }
}
