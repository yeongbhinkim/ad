package com.kh.practice5;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practice5_6);

        //컨트롤 알트 V 변수생성
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowHomeEnabled(true);
            actionBar.setIcon(R.drawable.ic_launcher_foreground);
        }
        setTitle("연습문제 5_6");
        //화살표: 알트 엔터
        findViewById(R.id.layout1).setOnClickListener(view -> {
            //컨트롤 알트 N
            extracted(view.getWidth() + ":" + view.getHeight());
        });

    }

    private void extracted(String info) {
        Toast.makeText(getApplicationContext(), info, Toast.LENGTH_SHORT).show();
    }
}