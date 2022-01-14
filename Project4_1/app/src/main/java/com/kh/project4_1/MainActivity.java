package com.kh.project4_1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText[] editTexts = new EditText[2]; //피연산자
    Button[] buttons = new Button[4];       //4칙연산
    TextView textView;                      //결과값

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        getSupportActionBar().setDisplayShowHomeEnabled(true);
//        getSupportActionBar().setIcon(R.drawable.ic_launcher);

        final ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.setDisplayShowHomeEnabled(true);
        supportActionBar.setIcon(R.drawable.ic_launcher);
        supportActionBar.setTitle(Html.fromHtml("<font color='#ffffff'>초간단 계산기</font>"));

        editTexts[0] = findViewById(R.id.Edit1);
        editTexts[1] = findViewById(R.id.Edit2);

        buttons[0] = findViewById(R.id.BtnAdd);
        buttons[1] = findViewById(R.id.BtnSub);
        buttons[2] = findViewById(R.id.BtnMul);
        buttons[3] = findViewById(R.id.BtnDiv);

        textView = findViewById(R.id.TextResult);

        //덧셈
        getaVoid();
        //뺄셈
        getaVoid1();
        //곱셈
        getaVoid2();
        //나눗셈
        getaVoid3();

    }

    private void getaVoid() {
        buttons[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String op1 = editTexts[0].getText().toString();
                String op2 = editTexts[1].getText().toString();

                textView.setText("덧셈결과 : " + String.valueOf(Double.valueOf(op1) + Double.valueOf(op2)));
            }
        });
    }
    private void getaVoid1() {
        buttons[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String op1 = editTexts[0].getText().toString();
                String op2 = editTexts[1].getText().toString();

                textView.setText("뺄셈결과 : " + String.valueOf(Double.valueOf(op1) - Double.valueOf(op2)));
            }
        });
    }
    private void getaVoid2() {
        buttons[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String op1 = editTexts[0].getText().toString();
                String op2 = editTexts[1].getText().toString();

                textView.setText("곱셈결과 : " + String.valueOf(Double.valueOf(op1) * Double.valueOf(op2)));
            }
        });
    }
    private void getaVoid3() {
        buttons[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String op1 = editTexts[0].getText().toString();
                String op2 = editTexts[1].getText().toString();

                textView.setText("나눗셈결과 : " + String.valueOf(Double.valueOf(op1) / Double.valueOf(op2)));
            }
        });
    }
}