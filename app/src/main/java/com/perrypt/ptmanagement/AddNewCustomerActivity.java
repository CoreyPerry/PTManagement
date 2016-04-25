package com.perrypt.ptmanagement;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.perrypt.ptmanagement.database.CustomerDbSchema.*;

import java.util.jar.Attributes;

public class AddNewCustomerActivity extends AppCompatActivity {

    private EditText mNameText;
    private EditText mHeightText;
    private EditText mWeightText;
    private EditText mAgeText;
    private Context mContext;
    private Button mSubmitButton;
    private SQLiteDatabase mDatabase;


    private AddNewCustomerActivity(Context context) {
        mContext = context.getApplicationContext();
        //mDatabase = new mCustomerEntryDbHelper(mContext).getWritableDatabase();
    }


    private static ContentValues getContentValues(String customer_Name, Integer customer_Height,
    Integer customer_Weight, Integer customer_Age) {
        ContentValues values = new ContentValues();
        values.put(customerTable.Cols.COLUMN_NAME_CUSTOMER_NAME, customer_Name);
        values.put(customerTable.Cols.COLUMN_NAME_CUSTOMER_HEIGHT, customer_Height);
        values.put(customerTable.Cols.COLUMN_NAME_CUSTOMER_WEIGHT, customer_Weight);
        values.put(customerTable.Cols.COLUMN_NAME_CUSTOMER_AGE, customer_Age);

        return values;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_customer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mNameText = (EditText)findViewById(R.id.nameEditText);
        mHeightText = (EditText)findViewById(R.id.heightEditText);
        mWeightText = (EditText)findViewById(R.id.weightEditText);
        mAgeText = (EditText)findViewById(R.id.ageEditText);

        mSubmitButton = (Button) findViewById(R.id.profileSubmitButton);
        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }



   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_options_menu, menu);
        menu.findItem(R.menu.main_options_menu).setIntent(new Intent
                (AddNewCustomerActivity.this, LoginActivity.class));
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.logout_menu_item) {
            super.onOptionsItemSelected(item);
            startActivity(item.getIntent());
        }
        return true;
    }*/
}
