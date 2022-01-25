package com.kh.project10_1;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.annotation.Nullable;

public class ThirdActivity extends Activity {

  final static private String TAG = "ThirdActivity";

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.third);

    Button button = findViewById(R.id.btnReturn);
    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        finish();
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
