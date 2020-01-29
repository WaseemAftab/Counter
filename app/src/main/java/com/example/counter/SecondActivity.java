package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    TextView tv;
    String st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv = (TextView)findViewById(R.id.txtview1);

        st=getIntent().getExtras().getString("value");
        tv.setText(st);
    }
}
