package com.example.easymathscalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Factorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial);
        final EditText et_number = findViewById(R.id.number);
        Button bt_result = findViewById(R.id.result1);
        final EditText et_result = findViewById(R.id.result);

        bt_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = Integer.parseInt(et_number.getText().toString());
                int n,f = 1;
                for(n = 1;n<= number;n++){
                    f= f*n;
                }

                    et_result.setText(Integer.toString(f));

            }
        });
    }
}
