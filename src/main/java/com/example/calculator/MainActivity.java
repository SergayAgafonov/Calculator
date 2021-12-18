package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText  editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Click(View v) {
        try{
        editText = findViewById(R.id.Sum1);
        editText = findViewById(R.id.Sum2);
        int intSum1 = Integer.parseInt(String.valueOf(editText.getText()));
        int intSum2 = Integer.parseInt(String.valueOf(editText.getText()));
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("intSum1", intSum1);
        intent.putExtra("intSum2", intSum2);
        startActivity(intent);
        } catch (Exception e) {
            Toast.makeText(this, "Введите значение", Toast.LENGTH_LONG).show();
        }
    }
}