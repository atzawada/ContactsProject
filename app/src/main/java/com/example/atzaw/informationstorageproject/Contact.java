package com.example.atzaw.informationstorageproject;

/**
 * Created by atzaw on 2/2/2018.
 */

public class Contact {
    String firstName;
    String lastName;
    int number;
    String email;

    public Contact(String first, String last, int num, String email) {
        this.firstName = first;
        this.lastName = last;
        this.number = num;
        this.email = email;
    }

    public Contact(String first, String last, int num) {
        this.firstName = first;
        this.lastName = last;
        this.number = num;
        this.email = null;
    }

    public Contact(String first, String last, String email) {
        this.firstName = first;
        this.lastName = last;
        this.number = -1;
        this.email = email;
    }

    public Contact() {
        this.firstName = null;
        this.lastName = null;
        this.number = -1;
        this.email = null;
    }
}
