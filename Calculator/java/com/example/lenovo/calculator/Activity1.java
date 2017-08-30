package com.example.lenovo.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity1 extends AppCompatActivity {

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,bc;
    EditText e,e1;
    int add,mul,div,sub;
    Float a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        b0=(Button) findViewById(R.id.btn0);
        b1=(Button) findViewById(R.id.btn1);
        b2=(Button) findViewById(R.id.btn2);
        b3=(Button) findViewById(R.id.btn3);
        b4=(Button) findViewById(R.id.btn4);
        b5=(Button) findViewById(R.id.btn5);
        b6=(Button) findViewById(R.id.btn6);
        b7=(Button) findViewById(R.id.btn7);
        b8=(Button) findViewById(R.id.btn8);
        b9=(Button) findViewById(R.id.btn9);
        b10=(Button) findViewById(R.id.add);
        b11=(Button) findViewById(R.id.minus);
        b12=(Button) findViewById(R.id.multiply);
        b13=(Button) findViewById(R.id.divide);
        b14=(Button) findViewById(R.id.result);
        bc=(Button) findViewById(R.id.clear);

        e=(EditText) findViewById(R.id.display);
        e1=(EditText) findViewById(R.id.display1);


       bc.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               e.setText("");
               e1.setText("");
           }
       });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText().toString()+"0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText().toString()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText().toString()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText().toString()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText().toString()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText().toString()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText().toString()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText().toString()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText().toString()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText().toString()+"9");
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* if (e==null) {
                    e.setText(null);
                }
                else {*/
                    //e.setText("+");
                    a = Float.parseFloat(String.valueOf(e.getText()));
                    add = 1;
                    e.setText(null);

            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //e.setText("-");
                a=Float.parseFloat(String.valueOf(e.getText()));
                sub=1;
                e.setText(null);
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //e.setText("*");
                a=Float.parseFloat(String.valueOf(e.getText()));
                mul=1;
                e.setText(null);
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //e.setText("/");
                a=Float.parseFloat(String.valueOf(e.getText()));
                div=1;
                e.setText(null);
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //e.setText("=");
                b=Float.parseFloat(String.valueOf(e.getText()));

                if (add==1){
                    e.setText("=");
                    e1.setText(a+b+"");
                    add=0;
                }
                if (mul==1){
                    e.setText("=");
                    e1.setText(a*b+"");
                    mul=0;
                }
                if (div==1){
                    e.setText("=");
                    e1.setText(a/b+"");
                    div=0;
                }
                if (sub==1){
                    e.setText("=");
                    e1.setText(a-b +"");
                    sub=0;
                }
            }
        });
    }

}
