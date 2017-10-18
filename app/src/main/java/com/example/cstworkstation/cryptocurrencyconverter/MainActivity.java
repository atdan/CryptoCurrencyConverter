package com.example.cstworkstation.cryptocurrencyconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openBitcoinConversion(View view) {
        Intent i = new Intent(this, BitcoinConversion.class);
        startActivity(i);
    }

    public  void openEthereumConversion(View view){
        Intent i = new Intent(this, EthereumConversion.class);
        startActivity(i);
    }
}
