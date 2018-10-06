package com.example.charanpuli.distfinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;


import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b=(Button)findViewById(R.id.button);

        final RadioGroup rg=(RadioGroup)findViewById(R.id.radioGroup);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText e1=(EditText) findViewById(R.id.editText2);
                EditText e2=(EditText) findViewById(R.id.editText3);
                int ri=rg.getCheckedRadioButtonId();
                EditText e=(EditText)findViewById(R.id.editText6);
                RadioButton rb=(RadioButton)findViewById(ri);
                rb.setEnabled(false);
                if(rb.getText().equals("milestokm")) {
                    rb.setEnabled(true);
                    double miles = Double.valueOf(e1.getText().toString());
                    double km = miles / 0.62137;
                    DecimalFormat d = new DecimalFormat("##.##");
                    e.setText(d.format(km));
                }
                if(rb.getText().equals("kmtomiles")) {
                    double km = Double.valueOf(e2.getText().toString());
                    double miles = km*0.62137;
                    rb.setEnabled(true);
                    DecimalFormat d = new DecimalFormat("##.##");
                    e.setText(d.format(miles));
                }

            }
        });


    }
}

