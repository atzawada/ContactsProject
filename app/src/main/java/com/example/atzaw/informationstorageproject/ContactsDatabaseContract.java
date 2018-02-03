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

        public static final String SQL_CREATE_TABLE = "CREATE TABLE " + ContactEntry.TABLE_NAME +
                " (" + ContactEntry._ID + " INTEGER PRIMARY KEY, " +
                ContactEntry.COLUMN_NAME_FIRSTNAME + " TEXT, " + ContactEntry.COLUMN_NAME_LASTNAME +
                " TEXT, " + ContactEntry.COLUMN_NAME_NUMBER + " TEXT, " +
                ContactEntry.COLUMN_NAME_EMAIL + "TEXT)";

        private static final String SQL_DELETE_TABLE = "DROP TABLE IF EXISTS " +
                ContactEntry.TABLE_NAME;
    }

}
