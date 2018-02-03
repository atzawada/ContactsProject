package com.example.atzaw.informationstorageproject;

import android.view.View;
import android.content.Intent;

/**
 * Created by atzaw on 2/2/2018.
 */

public class Contact {
    String firstName;
    String lastName;
    String number;
    String email;

    public Contact(String first, String last, String num, String email) {
        this.firstName = first;
        this.lastName = last;
        this.number = num;
        this.email = email;
    }

    public Contact(String first, String last, String num, int i) {
        this.firstName = first;
        this.lastName = last;
        this.number = num;
        this.email = null;
    }

    public Contact(String first, String last, String email) {
        this.firstName = first;
        this.lastName = last;
        this.number = null;
        this.email = email;
    }

    public Contact() {
        this.firstName = null;
        this.lastName = null;
        this.number = null;
        this.email = null;
    }

}
