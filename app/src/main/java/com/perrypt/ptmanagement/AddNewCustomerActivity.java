package com.perrypt.ptmanagement;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.perrypt.ptmanagement.database.CustomerDbSchema;

import java.util.jar.Attributes;

public class AddNewCustomerActivity extends AppCompatActivity {


    private Context mContext;
    private SQLiteDatabase mDatabase;


    private AddNewCustomerActivity(Context context) {

    }


    /*private static ContentValues getContentValues(Context context) {
        ContentValues values = new ContentValues();
        values.put(CustomerDbSchema.CustomerTable.Cols.Name, name);
        values.put(CustomerDbSchema.CustomerTable.Cols.Height,height);
        values.put(CustomerDbSchema.CustomerTable.Cols.Weight,weight);
        values.put(CustomerDbSchema.CustomerTable.Cols.Age, age);

        return values;
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_customer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
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
