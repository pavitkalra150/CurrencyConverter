package com.example.currencycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public EditText cad;
    public EditText usd;
    public Button convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cad = findViewById(R.id.cadvalue);
        usd = findViewById(R.id.usdvalue);
        convert = findViewById(R.id.convertbtn);

    }

    public void currencyConverter(View view){
        String c = cad.getText().toString();
        String u = cad.getText().toString();
        double finalValue;
        String finalValue1;
        Double cadValue = Double.valueOf(c).doubleValue();
        Double usdValue = Double.valueOf(u).doubleValue();

        if( !c.isEmpty()){
            finalValue = cadValue * 0.75;
            finalValue1 = Double.toString(finalValue);
            usd.setText(finalValue1);
        }
        if( !u.isEmpty()){
            finalValue = usdValue * 1.33;
            finalValue1 = Double.toString(finalValue);
            cad.setText(finalValue1);
        }
        if(!c.isEmpty() && !u.isEmpty()){
            Toast.makeText(this, "please give only single field", Toast.LENGTH_SHORT).show();
        }
    }
}