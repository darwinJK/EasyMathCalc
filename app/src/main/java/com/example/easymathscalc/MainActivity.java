package com.example.easymathscalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt_factorial = findViewById(R.id.factorial);
        Button bt_prime_number = findViewById(R.id.prime_number);
        Button bt_factors = findViewById(R.id.factors);
        Button bt_shift_char= findViewById(R.id.shift_char);

        bt_factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Factorial.class);
                startActivity(intent);
            }
        });


        bt_prime_number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PrimeNumber.class);
                startActivity(intent);
            }
        });


        bt_factors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Factors.class);
                startActivity(intent);
            }
        });


        bt_shift_char.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ShiftChar.class);
                startActivity(intent);
            }
        });
    }
}
