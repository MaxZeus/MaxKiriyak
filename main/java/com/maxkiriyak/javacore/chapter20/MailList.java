package main.java.com.maxkiriyak.javacore.chapter20;

import java.util.LinkedList;

class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    public Address(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    @Override
    public String toString() {
        return  name + "\n" +
                street + "\n" +
                city + " " +
                state + " " +
                code + "\n";
    }
}
public class MailList {
    public static void main(String[] args) {
        LinkedList<Address> ll = new LinkedList<>();
        ll.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
        ll.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahomet", "IL", "61853"));
        ll.add(new Address("Tom Carlton", "867 Elm St", "Champaign", "IL", "61820"));

        ll.forEach(System.out::println);
    }

}
