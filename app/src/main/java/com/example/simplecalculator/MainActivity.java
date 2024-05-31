package com.example.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ADD(View v){
        EditText et1 = (EditText)findViewById(R.id.editTextNumber2);
        EditText et2 = (EditText)findViewById(R.id.editTextNumber3);
        EditText et3 = (EditText)findViewById(R.id.editTextNumber4);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1+n2;

        et3.setText("Addition Value " +result);
    }


    public void SUB(View v){
        EditText et1 = (EditText)findViewById(R.id.editTextNumber2);
        EditText et2 = (EditText)findViewById(R.id.editTextNumber3);
        EditText et3 = (EditText)findViewById(R.id.editTextNumber4);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1-n2;

        et3.setText("Subtract Value " +result);
    }

    public void MUL(View v){
        EditText et1 = (EditText)findViewById(R.id.editTextNumber2);
        EditText et2 = (EditText)findViewById(R.id.editTextNumber3);
        EditText et3 = (EditText)findViewById(R.id.editTextNumber4);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1*n2;

        et3.setText("Multiply Value " +result);
    }

    public void DIVIDE(View v){
        EditText et1 = (EditText)findViewById(R.id.editTextNumber2);
        EditText et2 = (EditText)findViewById(R.id.editTextNumber3);
        EditText et3 = (EditText)findViewById(R.id.editTextNumber4);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1/n2;

        et3.setText("Divide Value " +result);
    }
}