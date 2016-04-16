package com.perrypt.ptmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
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

}
