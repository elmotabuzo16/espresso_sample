package de.nenick.espressomacchiato.test.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/** Dummy test database helper */
public class PersonDbHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "person.db";

    public PersonDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /** Simple create method */
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(PersonContract.SQL_CREATE);
    }

    /** Simple update method */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        throw new UnsupportedOperationException();
    }
}
