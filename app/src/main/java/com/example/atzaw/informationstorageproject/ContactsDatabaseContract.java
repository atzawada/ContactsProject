package com.example.atzaw.informationstorageproject;

import android.provider.BaseColumns;

/**
 * Created by atzaw on 2/3/2018.
 */

public final class ContactsDatabaseContract {

    private ContactsDatabaseContract() {
        // Private to prevent instantiation
    }

    public static class ContactEntry implements BaseColumns {
        public static final String TABLE_NAME = "contacts";
        public static final String COLUMN_NAME_FIRSTNAME = "first_name";
        public static final String COLUMN_NAME_LASTNAME = "last_name";
        public static final String COLUMN_NAME_NUMBER = "phone_number";
        public static final String COLUMN_NAME_EMAIL = "email";
    }


}
