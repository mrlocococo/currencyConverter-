package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickConvert (View view) {

        Log.i("Info", "Converted");

        EditText editText = (EditText) findViewById(R.id.editText);

        String amountInDollars = editText.getText().toString();

        double amountInDollarsDouble = Double.parseDouble(amountInDollars);

        double amountInPoundsDouble = amountInDollarsDouble * 0.7;

        String amountInPoundsString = String.format("%.2f", amountInPoundsDouble);

        Log.i("Amount in Pounds", amountInPoundsString);

        Toast.makeText(this, "$" + amountInDollars + " is £" + amountInPoundsString , Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}