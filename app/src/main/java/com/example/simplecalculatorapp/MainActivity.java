package com.example.simplecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText numOne;
    EditText numTwo;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numOne = findViewById(R.id.valOne);
        numTwo = findViewById(R.id.valTwo);
        ans = findViewById(R.id.answerView);

    }

    public void addFun(View view) {
        int valOne = Integer.parseInt(numOne.getText().toString());
        int valTwo = Integer.parseInt(numTwo.getText().toString());
        int sum = valOne + valTwo;
        ans.setText(String.valueOf(sum));

    }

    public void subFun(View view) {
        
        int valOne = Integer.parseInt(numOne.getText().toString());
        int valTwo = Integer.parseInt(numTwo.getText().toString());
        int sub = valOne - valTwo;
        ans.setText(String.valueOf(sub));

    }

    public void producFun(View view) {
        int valOne = Integer.parseInt(numOne.getText().toString());
        int valTwo = Integer.parseInt(numTwo.getText().toString());
        int pro = valOne * valTwo;
        ans.setText(String.valueOf(pro));

    }

    public void divFun(View view) {
        int valOne = Integer.parseInt(numOne.getText().toString());
        int valTwo = Integer.parseInt(numTwo.getText().toString());
        int div = valOne/valTwo;
        ans.setText(String.valueOf(div));
    }

}
