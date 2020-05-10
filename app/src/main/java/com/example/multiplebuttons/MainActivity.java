package com.example.multiplebuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1=(Button)findViewById(R.id.btn1);
        Button btn2=(Button)findViewById(R.id.btn2);
        Button btn3=(Button)findViewById(R.id.btn3);
        Button btn4=(Button)findViewById(R.id.btn4);
        Button btn5=(Button)findViewById(R.id.btn5);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        TextView txt=(TextView)findViewById(R.id.txt);
        int a;
        switch (v.getId()){
            case R.id.btn1:
                Toast.makeText(this ,"Button ONE clicked", Toast.LENGTH_LONG).show();
                text(1);
                break;
            case R.id.btn2:
                text(2);
                Toast.makeText(this ,"Button TWO clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn3:
                text(3);
                Toast.makeText(this ,"Button THREE clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn4:
                text(4);
                Toast.makeText(this ,"Button FOUR clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn5:
                text(5);
                Toast.makeText(this ,"Button FIVE clicked", Toast.LENGTH_LONG).show();
                break;





        }
    }


    public void text(int  a){
        TextView txt=(TextView)findViewById(R.id.txt);
        txt.setText("button"+ ""+a+"" +"clicked");

    }
}
