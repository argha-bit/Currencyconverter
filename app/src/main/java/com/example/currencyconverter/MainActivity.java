package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convertMoney(View view)
    {
        EditText editText = (EditText) findViewById(R.id.currency);
        ImageView image = findViewById(R.id.imageView);
        image.setImageResource(R.drawable.dollar);
        String amount = convert(editText.getText().toString());
        Log.i("Money",amount);
        Toast.makeText(this,editText.getText().toString()+" Rupee to Dollar After Conversion is "+amount+"$",Toast.LENGTH_LONG).show();


    }
    String convert(String curr)
    {
        Double value = Double.parseDouble(curr);
        Double val = value/73.20;
        String mod=String.format("%.2f",val);

        return mod;

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
