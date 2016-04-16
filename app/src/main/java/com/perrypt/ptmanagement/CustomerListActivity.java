package com.perrypt.ptmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class CustomerListActivity extends AppCompatActivity {

    private Button mViewProfileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mViewProfileButton = (Button)findViewById(R.id.view_Profile_Button1);
        mViewProfileButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //Start AddNewCustomerActivity
                Intent k = new Intent(CustomerListActivity.this, CustomerInformationActivity.class);
                startActivity(k);
            }
        });
    }
}
