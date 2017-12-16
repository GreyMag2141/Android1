package ru.myfirstapp.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText input1;
    EditText input2;
    Button button1;
    Button button2;
    TextView output;
    private boolean p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 =  findViewById(R.id.input1);
        input2 =  findViewById(R.id.input2);
        output =  findViewById(R.id.output);
        button1 =  findViewById(R.id.button1);
        button2 =  findViewById(R.id.button2);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
        String s1 = input1.getText().toString();
        String s2 = input2.getText().toString();
        int x1 = Integer.parseInt(s1);
        int x2 = Integer.parseInt(s2);
        output.setText(String.valueOf(x1+x2));
                break;
            case R.id.button2:
                String s3 = input1.getText().toString();
                String s4 = input2.getText().toString();
                int y1 = Integer.parseInt(s3);
                int y2 = Integer.parseInt(s4);
                output.setText(String.valueOf(y1-y2));
                break;
        }
    }

//    public void clickButton(View view){
//        String s1 = input1.getText().toString();
//        String s2 = input2.getText().toString();
//        int x1 = Integer.parseInt(s1);
//        int x2 = Integer.parseInt(s2);
//        output.setText(String.valueOf(x1+x2));
//        btn.setText("Отлично");
//    }

}