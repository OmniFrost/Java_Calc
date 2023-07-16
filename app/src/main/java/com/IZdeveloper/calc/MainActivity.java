package com.IZdeveloper.calc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nFirst;
    private EditText nSecond;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nFirst = findViewById(R.id.txt1Num);
        nSecond = findViewById(R.id.txt2Num);
        output = findViewById(R.id.txtOutput);
    }

    public void addition(View view) {
        int inputFirNumb, inputSecNumb, sum;

        inputFirNumb = Integer.parseInt(nFirst.getText().toString());
        inputSecNumb = Integer.parseInt(nSecond.getText().toString());
        sum = inputFirNumb + inputSecNumb;

        output.setText(Integer.toString(sum));
    }

    public void minus(View view) {
        int inputFirNumb, inputSecNumb, result;

        inputFirNumb = Integer.parseInt(nFirst.getText().toString());
        inputSecNumb = Integer.parseInt(nSecond.getText().toString());
        result = inputFirNumb - inputSecNumb;

        output.setText(Integer.toString(result));
    }

    public void times(View view) {
        int inputFirNumb, inputSecNumb, result;

        inputFirNumb = Integer.parseInt(nFirst.getText().toString());
        inputSecNumb = Integer.parseInt(nSecond.getText().toString());
        result = inputFirNumb * inputSecNumb;

        output.setText(Integer.toString(result));
    }

    public void divide(View view) {
        float inputFirNumb, inputSecNumb, result;

        inputFirNumb = Float.parseFloat(nFirst.getText().toString());
        inputSecNumb = Float.parseFloat(nSecond.getText().toString());
        result = inputFirNumb / inputSecNumb;

        output.setText(Float.toString(result));
    }
}