package com.togglebutton.suhas.acd_an_session_3_assignment_1_main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtvw1 = (TextView) findViewById(R.id.textview1);
        ToggleButton tbtn1 = (ToggleButton)findViewById(R.id.toggleButton);

        tbtn1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                txtvw1.setVisibility(View.INVISIBLE);
                }

                else {
txtvw1.setVisibility(View.VISIBLE);
                }
            }
        });



                }





}
