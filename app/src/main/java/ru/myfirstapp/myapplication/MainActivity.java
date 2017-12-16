package ru.myfirstapp.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText input1;
//    EditText input2;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    TextView output;
    private boolean p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.input1);
//        input2 = findViewById(R.id.input2);
        output = findViewById(R.id.output);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String s1 = input1.getText().toString();
//        String s2 = input2.getText().toString();
        double x1 = Integer.parseInt(s1);
//        int x2 = Integer.parseInt(s2);
        switch (v.getId()){
            case R.id.button1:
        output.setText(String.valueOf(x1*1.8+32));
                break;
            case R.id.button2:
               output.setText(String.valueOf(x1+273.15));
               break;
            case R.id.button3:
                output.setText(String.valueOf(x1*0.8));
                break;
            case R.id.button4:
                output.setText(String.valueOf((100-x1)*1.5));
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