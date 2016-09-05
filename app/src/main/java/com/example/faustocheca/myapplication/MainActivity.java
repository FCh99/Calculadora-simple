package com.example.faustocheca.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView textView1;
    TextView textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        textView1 = (TextView) findViewById(R.id.textview_suma);
        textView2 = (TextView) findViewById(R.id.textview_multiplicacion);


        Calculator calculator = new Calculator(10, 15);

        textView1.setText(String.valueOf(calculator.add()));
        textView2.setText(String.valueOf(calculator.multiply()));






    }



}
