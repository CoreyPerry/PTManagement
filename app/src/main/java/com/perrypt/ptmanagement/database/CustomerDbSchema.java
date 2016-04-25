package com.perrypt.ptmanagement.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;


/**
 * Created by Grayscript on 4/24/2016.
 */
public class CustomerDbSchema {
   public static final class customerContract {
       public customerContract(){}

       public static abstract class customerEntry implements BaseColumns {
           public static final String TABLE_NAME = "customers";
           public static final String COLUMN_NAME_CUSTOMER_NAME = "name";
           public static final String COLUMN_NAME_CUSTOMER_HEIGHT = "height";
           public static final String COLUMN_NAME_CUSTOMER_WEIGHT = "weight";
           public static final String COLUMN_NAME_CUSTOMER_AGE = "age";

       }

       private static final String TEXT_TYPE = "TEXT";
       private static final String COMMA_SEP = ",";
       private static final String SQL_CREATE_ENTRIES = "CREATE TABLE" + customerEntry.TABLE_NAME +
               "(" + customerEntry._ID + "INTEGER PRIMARY KEY," +
               customerEntry.COLUMN_NAME_CUSTOMER_NAME + TEXT_TYPE + COMMA_SEP +
               customerEntry.COLUMN_NAME_CUSTOMER_HEIGHT + TEXT_TYPE + COMMA_SEP +
               customerEntry.COLUMN_NAME_CUSTOMER_WEIGHT + TEXT_TYPE + COMMA_SEP +
               customerEntry.COLUMN_NAME_CUSTOMER_AGE + ")";

       private static final String SQL_DELETE_ENTRIES =
               "DROP TABLE IF EXISTS" + customerEntry.TABLE_NAME;

       public class customerEntryDbHelper extends SQLiteOpenHelper {

           public static final int DATABASE_VERSION = 1;
           public static final String DATABASE_NAME = "customerEntry.db";

           public customerEntryDbHelper(Context context) {
               super(context, DATABASE_NAME, null, DATABASE_VERSION);
           }

           @Override
           public void onCreate(SQLiteDatabase db) {
               db.execSQL(SQL_CREATE_ENTRIES);
           }

           @Override
           public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
               db.execSQL(SQL_DELETE_ENTRIES);
               onCreate(db);
           }
       }



   }
}
