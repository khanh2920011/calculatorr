package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btZero,btDZero,btDIV,btMINUS,btPLUS,btAC,btDEl,btON,btEQUAl,btDot,btMUTIL;
    private TextView textviewHistory,textviewResult;
    private String number=null;
    double lastnumber=0, firstnumber=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btZero=this.findViewById(R.id.btZero);
        btDZero=this.findViewById(R.id.btDZero);
        bt1=this.findViewById(R.id.bt1);
        bt2=this.findViewById(R.id.bt2);
        bt3=this.findViewById(R.id.bt3);
        bt4=this.findViewById(R.id.bt4);
        bt5=this.findViewById(R.id.bt5);
        bt6=this.findViewById(R.id.bt6);
        bt7=this.findViewById(R.id.bt7);
        bt8=this.findViewById(R.id.bt8);
        bt9=this.findViewById(R.id.bt9);

        btDIV=this.findViewById(R.id.btDIV);
        btMINUS=this.findViewById(R.id.btMINUS);
        btPLUS=this.findViewById(R.id.btPLUS);
        btMUTIL=this.findViewById(R.id.btMUTIL);
        btEQUAl=this.findViewById(R.id.btEQUAL);

        btDot=this.findViewById(R.id.btDot);
        btAC=this.findViewById(R.id.btAC);
        btDEl=this.findViewById(R.id.btDEL);
        btON=this.findViewById(R.id.btON);

        textviewHistory=this.findViewById(R.id.textviewHistory);
        textviewResult=this.findViewById(R.id.textviewResult);

        btZero.setOnClickListener(view -> numberclick("0"));
        btDZero.setOnClickListener(view -> numberclick("00"));
        bt1.setOnClickListener(view -> numberclick("1"));
        bt2.setOnClickListener(view -> numberclick("2"));
        bt3.setOnClickListener(view -> numberclick("3"));
        bt4.setOnClickListener(view -> numberclick("4"));
        bt5.setOnClickListener(view -> numberclick("5"));
        bt6.setOnClickListener(view -> numberclick("6"));
        bt7.setOnClickListener(view -> numberclick("7"));
        bt8.setOnClickListener(view -> numberclick("8"));
        bt9.setOnClickListener(view -> numberclick("9"));

    }

    public void numberclick(String view ){
        if (number==null){
            number=view;
        } else {
            number=number+view;
        }
        textviewResult.setText(number);
    }

}