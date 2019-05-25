package com.example.easymathscalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ShiftChar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shift_char);
        final EditText et_word = findViewById(R.id.word);
        Button bt_word = findViewById(R.id.result1);
        final TextView tv_result = findViewById(R.id.result);
        final EditText ed_shift =findViewById(R.id.shift_no);
        bt_word.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String word = et_word.getText().toString();
            int number = Integer.parseInt(ed_shift.getText().toString());
            char[] stringToCharArray = word.toCharArray();
            for (int i=number;i>0;i--){
                char last = stringToCharArray[stringToCharArray.length-1];
                for (int j =stringToCharArray.length-2;j>=0;j--)
                    stringToCharArray[j+1]=stringToCharArray[j];
                    stringToCharArray[0]=last;
            }
                String shift_result = new String(stringToCharArray);
                tv_result.setText(shift_result);

            }
        });
    }
}
