package com.example.quadraticapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button calcBtn = (Button) findViewById(R.id.calcBtn);
        final TextView aView = (TextView) findViewById(R.id.aView);
        final TextView bView = (TextView) findViewById(R.id.bView);
        final TextView cView = (TextView) findViewById(R.id.cView);
        calcBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                double a =((getX1()*(getY3()-getY2()))+(getX2()*(getY1()-getY3()))+(getX3()*(getY2()-getY1())))
                                    /((getX1()-getX2())*(getX1()-getX3())*(getX2()-getX3()));

                double b = ((getY2()-getY1())/(getX2()-getX1()))-(a*(getX1()+getX2()));

                double c =(getY1() - (a*Math.pow(getX1(),2))-(b*getX1()));
                aView.setText(a+"");
                bView.setText(b+"");
                cView.setText(c+"");


            }
        });

    }
    private double getX1(){
        EditText x1EditText = (EditText) findViewById(R.id.x1editText);
        return  Double.parseDouble(x1EditText.getText().toString());

    };
    private double getY1(){
        EditText y1editText = (EditText) findViewById(R.id.y1editText);
        return  Double.parseDouble(y1editText.getText().toString());

    };
    private double getX2(){
        EditText x2EditText = (EditText) findViewById(R.id.x2editText);
        return  Double.parseDouble(x2EditText.getText().toString());

    };
    private double getY2(){
        EditText y2editText = (EditText) findViewById(R.id.y2editText);
        return  Double.parseDouble(y2editText.getText().toString());

    };
    private double getX3(){
        EditText x3EditText = (EditText) findViewById(R.id.x3editText);
        return  Double.parseDouble(x3EditText.getText().toString());

    };
    private double getY3(){
        EditText y3editText = (EditText) findViewById(R.id.y3editText);
        return  Double.parseDouble(y3editText.getText().toString());

    };
}
