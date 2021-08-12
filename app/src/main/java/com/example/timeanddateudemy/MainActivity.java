package com.example.timeanddateudemy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.DateKeyListener;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.text.method.MultiTapKeyListener;
import android.text.method.QwertyKeyListener;
import android.text.method.TextKeyListener;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2, e3, e4, e5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //decimal and signs
        e1 = findViewById(R.id.in1);
        DigitsKeyListener kl1 = DigitsKeyListener.getInstance(true, true);
        e1.setKeyListener(kl1);

        //only dec with no signs
        e2 = findViewById(R.id.in2);
        DigitsKeyListener kl2 = DigitsKeyListener.getInstance(false, true);
        e2.setKeyListener(kl2);

        //date
        e3 = findViewById(R.id.in3);
        DateKeyListener kl3 = DateKeyListener.getInstance();
        e3.setKeyListener(kl3);


        //multi tap
        e4 = findViewById(R.id.in4);
        MultiTapKeyListener kl4 = new MultiTapKeyListener(TextKeyListener.Capitalize.WORDS, true);
        e4.setKeyListener(kl4);

        //Qwerty
        e5 = findViewById(R.id.in5);    
        QwertyKeyListener kl5 = new QwertyKeyListener(TextKeyListener.Capitalize.SENTENCES, true);
        e5.setKeyListener(kl5);
    }
}