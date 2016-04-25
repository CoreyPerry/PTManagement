package com.perrypt.ptmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class CustomerInformationActivity extends AppCompatActivity {

    private Button mViewSessionsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_information);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mViewSessionsButton = (Button)findViewById(R.id.new_Customer_Button);
        mViewSessionsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //Start AddNewCustomerActivity
                Intent j = new Intent(CustomerInformationActivity.this, SessionListActivity.class);
                startActivity(j);
            }
        });
    }
    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_options_menu, menu);
        menu.findItem(R.menu.main_options_menu).setIntent(new Intent
                (CustomerInformationActivity.this, LoginActivity.class));
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
