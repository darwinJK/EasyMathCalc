package com.example.easymathscalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Factors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factors);
        final EditText et_number = findViewById(R.id.number);
        final TextView tv_result = findViewById(R.id.result);
        Button bt_result = findViewById(R.id.result1);
        final int data[] = new int[10];

        bt_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int j=0;
                int number = Integer.parseInt(et_number.getText().toString());
                for(int i =1;i<=number;i++) {
                    if (number % i == 0) {
                        data[j]=i;
                        j++;
                    }
                }
                for(int i = 0; i < j; i++) {
                    tv_result.append(Integer.toString(data[i])+ ", ");
                }
            }
        });




    }
}
