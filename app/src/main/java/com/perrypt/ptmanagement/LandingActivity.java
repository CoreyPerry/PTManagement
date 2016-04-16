package com.perrypt.ptmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class LandingActivity extends FragmentActivity {

    private Button mCustomerListButton;
    private Button mNewCustomerButton;
    private Button mPaymentButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        mCustomerListButton = (Button) findViewById(R.id.customer_List_Button);
        mCustomerListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start CustomerListActivity
                Intent i = new Intent(LandingActivity.this, CustomerListActivity.class);
                startActivity(i);
            }
        });

        mNewCustomerButton = (Button) findViewById(R.id.new_Customer_Button);
        mNewCustomerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start AddNewCustomerActivity
                Intent j = new Intent(LandingActivity.this, AddNewCustomerActivity.class);
                startActivity(j);
            }
        });

        mPaymentButton = (Button) findViewById(R.id.payment_Button);
        mPaymentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start PaymentAuthorizationActivity
                Intent k = new Intent(LandingActivity.this, PaymentAuthorizationActivity.class);
                startActivity(k);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_options_menu, menu);
        menu.findItem(R.menu.main_options_menu).setIntent(new Intent
                (LandingActivity.this, LoginActivity.class));
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
    }
}
