package com.example.easymathscalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrimeNumber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime_number);
        final EditText et_number = findViewById(R.id.number);
        Button bt_result = findViewById(R.id.result1);
        final TextView tv_result = findViewById(R.id.result);

        bt_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = Integer.parseInt(et_number.getText().toString());
                int i;
                boolean f=true;
                for(i=2;i<number;i++){
                    if(number %i ==0){
                        f=false;
                        break;
                    }
                }
                if(f == false){
                    tv_result.setText("THE NUMBER IS NOT PRIME");
                }
                else{
                    tv_result.setText("THE NUMBER IS PRIME");

                }
            }
        });
    }
}
