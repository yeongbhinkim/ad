package com.kh.exercise2_7;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button[] buttons = new Button[2];
    RadioButton[] radioButton = new RadioButton[2];
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //UI 연결
        setContentView(R.layout.activity_main);

        //앱 아이콘 적용
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setTitle(Html.fromHtml("<font color='#ffffff'>좀 그럴듯한 앱</font>"));

        //앱 뷰 타게팅
        editText = findViewById(R.id.editText);
        buttons[0] = findViewById(R.id.btn1);
        buttons[1] = findViewById(R.id.btn2);
        radioButton[0] = findViewById(R.id.radioButton3);
        radioButton[1] = findViewById(R.id.radioButton4);
        imageView = findViewById(R.id.imageView);

        //뷰 리스너 등록 및 핸들러 구현
        buttons[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();
            }
        });

        buttons[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(str));
                startActivity(intent);
            }
        });
        radioButton[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            imageView.setImageResource(R.drawable.q);
            }
        });
        radioButton[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            imageView.setImageResource(R.drawable.r);
            }
        });


    }
}