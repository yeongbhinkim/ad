package com.kh.practice4_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        setTitle("연습문제4_8");

        editText = findViewById(R.id.et);

        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                if (keyEvent.getAction() == keyEvent.ACTION_UP) {
                    String str = editText.getText().toString();
                    Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
                }

                if (keyEvent.getKeyCode() == keyEvent.KEYCODE_ENTER) {
                    Toast.makeText(getApplicationContext(), "Enter 눌러짐", Toast.LENGTH_SHORT).show();
                }

                return false;

            }
        });

    }
}