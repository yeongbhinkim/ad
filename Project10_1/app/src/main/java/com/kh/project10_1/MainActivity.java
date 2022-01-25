package com.kh.project10_1;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
  final static private String TAG = "MainActivity";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Log.i(TAG, "onCreate()호출됨!");

    RadioButton rbtn1 = findViewById(R.id.rbtn1);
    RadioButton rbtn2 = findViewById(R.id.rbtn2);

    Button button = findViewById(R.id.btnNewActivity);
    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {

        if(rbtn1.isChecked()) {
          Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
          startActivity(intent);
          } else if(rbtn1.isChecked()) {
          Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
          startActivity(intent);
        }
      }
    });
  }

  @Override
  protected void onStart() {
    super.onStart();
    Log.i(TAG, "onStart() 호출됨!");
  }

  @Override
  protected void onResume() {
    super.onResume();
    Log.i(TAG, "onResume() 호출됨!");
  }

  @Override
  protected void onStop() {
    super.onStop();
    Log.i(TAG, "onStop() 호출됨!");
  }

  @Override
  protected void onPause() {
    super.onPause();
    Log.i(TAG, "onPause() 호출됨!");
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    Log.i(TAG, "onDestroy() 호출됨!");
  }

}