package com.kh.project4_1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
<<<<<<< HEAD
import android.text.Html;
=======
>>>>>>> 3d20aa370ccfafa8405e834d9edfa3fca9b73691
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText[] editTexts = new EditText[2];  //피연자
<<<<<<< HEAD
    Button[] buttons = new Button[5];        //4칙연산
    TextView textView;                       //결과값

//    LinearLayout linearLayout;
=======
    Button[] buttons = new Button[4];        //4칙연산
    TextView textView;                       //결과값

    LinearLayout linearLayout;
>>>>>>> 3d20aa370ccfafa8405e834d9edfa3fca9b73691

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.setDisplayShowHomeEnabled(true);
        supportActionBar.setIcon(R.drawable.ic_launcher);
<<<<<<< HEAD
        ActionBar actionbar = getSupportActionBar();
        actionbar.setTitle(Html.fromHtml("<font color='#ffffff'>좀 그럴듯한 앱</font>"));
=======
>>>>>>> 3d20aa370ccfafa8405e834d9edfa3fca9b73691

        editTexts[0] = findViewById(R.id.Edit1);
        editTexts[1] = findViewById(R.id.Edit2);

<<<<<<< HEAD
//        linearLayout = findViewById((R.id.cont1));
=======
        linearLayout = findViewById((R.id.cont1));
>>>>>>> 3d20aa370ccfafa8405e834d9edfa3fca9b73691

        buttons[0] = findViewById(R.id.BtnAdd);
        buttons[1] = findViewById(R.id.BtnSub);
        buttons[2] = findViewById(R.id.BtnMul);
        buttons[3] = findViewById(R.id.BtnDiv);
        buttons[4] = findViewById(R.id.BtnP);

        textView = findViewById(R.id.TextResult);

        //덧셈
        buttons[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String op1 = editTexts[0].getText().toString();
                String op2 = editTexts[1].getText().toString();

                Log.d("add", op1);
                Log.d("add", op2);

<<<<<<< HEAD
                if(op1.trim().length() == 0 || op2.trim().length() == 0){
=======
                if(op1.trim().length() == 0 || op1.trim().length() == 0){
>>>>>>> 3d20aa370ccfafa8405e834d9edfa3fca9b73691
                    printMessage("피연산자가 누락되었습니다!");
                    return;
                }

                textView.setText( "덧셈결과 : " + String.valueOf(Double.valueOf(op1) + Double.valueOf(op2)));
<<<<<<< HEAD
                return;
=======
>>>>>>> 3d20aa370ccfafa8405e834d9edfa3fca9b73691
            }
        });

        //뺄셈
        buttons[1].setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                String op1 = editTexts[0].getText().toString();
                String op2 = editTexts[1].getText().toString();

                Log.d("sub", op1);
                Log.d("sub", op2);

<<<<<<< HEAD
                if(op1.trim().length() == 0 || op2.trim().length() == 0){
=======
                if(op1.trim().length() == 0 || op1.trim().length() == 0){
>>>>>>> 3d20aa370ccfafa8405e834d9edfa3fca9b73691
                    printMessage("피연산자가 누락되었습니다!");
                    return false;
                }

                textView.setText( "뺄셈결과 : " + String.valueOf(Double.valueOf(op1) - Double.valueOf(op2)));

                return true;
            }
        });

        //곱셈
        buttons[2].setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                String op1 = editTexts[0].getText().toString();
                String op2 = editTexts[1].getText().toString();

                Log.d("mul", op1);
                Log.d("mul", op2);

<<<<<<< HEAD
                if(op1.trim().length() == 0 || op2.trim().length() == 0){
=======
                if(op1.trim().length() == 0 || op1.trim().length() == 0){
>>>>>>> 3d20aa370ccfafa8405e834d9edfa3fca9b73691
                    printMessage("피연산자가 누락되었습니다!");
                    return false;
                }

                textView.setText( "곱셈결과 : " + String.valueOf(Double.valueOf(op1) * Double.valueOf(op2)));

                return true;
            }
        });
        //나눗셈
        buttons[3].setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                String op1 = editTexts[0].getText().toString();
                String op2 = editTexts[1].getText().toString();

                Log.d("div", op1);
                Log.d("div", op2);

<<<<<<< HEAD
                if(op1.trim().length() == 0 || op2.trim().length() == 0){
=======
                if(op1.trim().length() == 0 || op1.trim().length() == 0){
>>>>>>> 3d20aa370ccfafa8405e834d9edfa3fca9b73691
                    printMessage("피연산자가 누락되었습니다!");
                    return false;
                }

                textView.setText( "나눗셈결과 : " + String.valueOf(Double.valueOf(op1) / Double.valueOf(op2)));

                return true;
            }
        });

<<<<<<< HEAD
        //
        buttons[4].setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                String op1 = editTexts[0].getText().toString();
                String op2 = editTexts[1].getText().toString();

                Log.d("div", op1);
                Log.d("div", op2);

                if(op1.trim().length() == 0 || op2.trim().length() == 0){
                    printMessage("피연산자가 누락되었습니다!");
                    return false;
                }

                textView.setText( "나머지 값 결과 : " + String.valueOf(Double.valueOf(op1) % Double.valueOf(op2)));

                return true;
            }
        });

//        linearLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d("layout", view.toString());
//            }
//        });

=======
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("layout", view.toString());
            }
        });

>>>>>>> 3d20aa370ccfafa8405e834d9edfa3fca9b73691
    }

    private void printMessage(String msg) {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }
}