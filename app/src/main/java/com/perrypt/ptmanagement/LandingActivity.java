package com.perrypt.ptmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
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

        mCustomerListButton = (Button)findViewById(R.id.customer_List_Button);
        mCustomerListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start CustomerListActivity
                Intent i = new Intent(LandingActivity.this, CustomerListActivity.class);
                startActivity(i);
            }
        });

        mNewCustomerButton = (Button)findViewById(R.id.new_Customer_Button);
        mNewCustomerButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //Start AddNewCustomerActivity
                Intent j = new Intent(LandingActivity.this, AddNewCustomerActivity.class);
                startActivity(j);
            }
        });

        mPaymentButton = (Button)findViewById(R.id.payment_Button);
        mPaymentButton.setOnClickListener(new View.OnClickListener(){
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
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_landing, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
