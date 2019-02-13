package com.company;
/**
 * An address book contains the following fields: name, address, city, state, zip, phone, email.
 *
 * Create an object to hold those fields. Each field should be private and accessible to the main application only
 * through the getters and setters. One advantage of using getters and setters is to allow you to not only set the
 * value of a field, such as email and phone, but also validate the data as it comes in.
 *
 * Create a setter for phone and email that verify that the phone number is in the following format: (xxx) xxx-xxxx.
 * Create a setter for the email address to ensure it contains name@domain.com.
 *
 * To validate the email address and phone we're going to use something called regular expressions. We don't need to
 * know about this right now - it's not something we teach until the last few weeks of class. So here is the code to
 * validate these two fields. Simply copy the following methods to your address book class. They are private methods
 * so you will call them from your setter to determine if the email/phone is valid.
 *
 */
public class Main {

    public static void main(String[] args) {
        AddressBook book = new AddressBook();
        book.setEmail("mhussainshah79@gmail.com");
        System.out.println(book.getEmail());

        book.setPhone("917-478-4273");
        System.out.println(book.getPhone());
    }
}
