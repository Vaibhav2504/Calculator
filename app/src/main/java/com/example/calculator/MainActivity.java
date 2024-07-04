package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView text;
    Button buttonone, buttontwo, buttonthree, buttonfour, buttonfive, buttonsix, buttonseven, buttoneight, buttonnine, buttonzero;
    Button buttonadd, buttonmin, buttonmul, buttondiv, buttondot, buttonclear, buttoneq;
    int num0 = 0, num1 = 1, num2 = 2, num3 = 3, num4 = 4, num5 = 5, num6 = 6, num7 = 7, num8 = 8, num9 = 9;
    double temp = 0, result = 0, decimal = 1, decimalScale = 1;
    int scale = 10;
    String operator = "euqal";
    boolean op = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonzero = findViewById(R.id.button0);
        buttonone = findViewById(R.id.button1);
        buttontwo = findViewById(R.id.button2);
        buttonthree = findViewById(R.id.button3);
        buttonfour = findViewById(R.id.button4);
        buttonfive = findViewById(R.id.button5);
        buttonsix = findViewById(R.id.button6);
        buttonseven = findViewById(R.id.button7);
        buttoneight = findViewById(R.id.button8);
        buttonnine = findViewById(R.id.button9);
        buttonadd = findViewById(R.id.buttonadd);
        buttonmul = findViewById(R.id.buttonmul);
        buttonmin = findViewById(R.id.buttonmin);
        buttoneq = findViewById(R.id.buttoneq);
        buttondiv = findViewById(R.id.buttondiv);
        buttondot = findViewById(R.id.buttondot);
        buttonclear = findViewById(R.id.clear);
        text = findViewById(R.id.result);
        getNumber();
    }
    private void getNumber() {
        buttonzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = (temp * scale) + (0 * decimal);
                decimal = decimal * decimalScale;
                text.setText("" + temp);
            }
        });
        buttonone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = (temp * scale) + (1 * decimal);
                decimal = decimal * decimalScale;
                text.setText("" + temp);
            }
        });
        buttontwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = (temp * scale) + (2 * decimal);
                decimal = decimal * decimalScale;
                text.setText("" + temp);
            }
        });
        buttonthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = (temp * scale) + (3 * decimal);
                decimal = decimal * decimalScale;
                text.setText("" + temp);
            }
        });
        buttonfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = (temp * scale) + (4 * decimal);
                decimal = decimal * decimalScale;
                text.setText("" + temp);
            }
        });
        buttonfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = (temp * scale) + (5 * decimal);
                decimal = decimal * decimalScale;
                text.setText("" + temp);
            }
        });
        buttonsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = (temp * scale) + (6 * decimal);
                decimal = decimal * decimalScale;
                text.setText("" + temp);
            }
        });
        buttonseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = (temp * scale) + (7 * decimal);
                decimal = decimal * decimalScale;
                text.setText("" + temp);
            }
        });
        buttoneight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = (temp * scale) + (8 * decimal);
                decimal = decimal * decimalScale;
                text.setText("" + temp);
            }
        });
        buttonnine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = (temp * scale) + (9 * decimal);
                decimal = decimal * decimalScale;
                text.setText("" + temp);
            }
        });
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logic();
                operator = "plus";
            }
        });
        buttonmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logic();
                operator = "minus";
            }
        });
        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logic();
                operator = "divide";
            }
        });
        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logic();
                operator = "multi";
            }
        });
        buttoneq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logic();
                operator = "equal";
            }
        });
        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decimalScale = 0.1;
                decimal = 0.1;
                scale = 1;
            }
        });
        buttonclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = 0;
                result = 0;
                decimal = 1;
                decimalScale = 1;
                operator = "euqal";
                scale = 10;
                op = false;
                text.setText("0");
            }
        });
    }
    private void logic() {
        if (!op) {
            result = temp;
            op = true;
        } else {
            switch (operator) {
                case "plus":
                    result += temp;
                    break;
                case "minus":
                    result -= temp;
                    break;
                case "divide":
                    result /= temp;
                    break;
                case "multi":
                    result *= temp;
                    break;
            }
        }
        temp = 0;
        decimal = 1;
        scale = 10;
        text.setText(" " + result);
    }
}