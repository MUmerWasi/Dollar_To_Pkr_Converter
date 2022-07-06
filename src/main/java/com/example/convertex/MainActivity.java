package com.example.convertex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onClickButton(View view) {

        EditText dollar_amt= (EditText) findViewById(R.id.dollar_amt);
        String dollars = dollar_amt.getText().toString();
        Double doubleDollars=Double.parseDouble(dollars);
        Double doublePkr = 207 * doubleDollars;
        String toastText= "= " +  "Rs. " +doublePkr.toString();
        Toast.makeText(this,toastText,Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}