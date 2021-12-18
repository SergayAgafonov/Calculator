package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView textView = findViewById(R.id.resView);
        Bundle arguments = getIntent().getExtras();

        int intSum1 = arguments.getInt("intSum1");
        int intSum2 = arguments.getInt("intSum2");
        int result = intSum1 + intSum2;
        if (intSum2<0){
            String intSum2Output = "("+intSum2+")";
            textView.setText(""+intSum1+"+"+intSum2Output+"="+result);
        }
        else {
            textView.setText(""+intSum1+"+"+intSum2+"="+result);
        }

    }
}
