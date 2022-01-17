package com.kh.project4_4;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    Switch btnSwitch;
    ViewGroup linearLayout;
    RadioGroup radioGroup;
    ImageView imageView;
    RadioButton[] radioButtons = new RadioButton[3];
    Button[] button = new Button[2];




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //앱 아이콘 컨트롤 알트 V
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.setDisplayShowHomeEnabled(true);
        supportActionBar.setIcon(R.drawable.ic_launcher);

        //앱 타이틀
        setTitle("안드로이드 사진 보기");

        //뷰 참조해오기
        btnSwitch = findViewById(R.id.btnSwitch);
        linearLayout = findViewById(R.id.con1);
        button[0] = findViewById(R.id.BtnFinish);
        button[1] = findViewById(R.id.btnStart);
        radioGroup = findViewById(R.id.rg);
        imageView = findViewById(R.id.iv);
        
        radioButtons[0] = findViewById(R.id.BtnR1);
        radioButtons[1] = findViewById(R.id.BtnR2);
        radioButtons[2] = findViewById(R.id.BtnR3);


        //이벤트 리스너 등록 및 핸들러 구현
        btnSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Log.d(TAG, compoundButton.toString());

                //체크 했을경우
                if (btnSwitch.isChecked()){
                    linearLayout.setVisibility(View.VISIBLE);

                //체크하지 않을경우
                }else {
                    linearLayout.setVisibility(View.INVISIBLE);
                    
                    //라디오버튼을 unchecked로 초기화
                    for(RadioButton rb : radioButtons){
                        if(rb.isChecked()){
                            rb.setChecked(false);
                        }
                    }
                }

            }
        });
        //선택버튼 배열로도 가능
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (radioGroup.getCheckedRadioButtonId()){
                    case R.id.BtnR1:
                        imageView.setImageResource(R.drawable.pie);
                        break;
                    case R.id.BtnR2:
                        imageView.setImageResource(R.drawable.q10);
                        break;
                    case R.id.BtnR3:
                        imageView.setImageResource(R.drawable.r11);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),
                                "동물을 선택하세요!", Toast.LENGTH_LONG).show();
                }
            }
        });
        //종료버튼 (알트+엔터)
        button[0].setOnClickListener(view -> finish());
        //시작버튼
        //화살표 함수(알트+엔터) : 값이 1개 일때
        button[1].setOnClickListener(view -> {btnSwitch.setChecked(false);});
//        button[1].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                btnSwitch.setChecked(false);
//            }
//        });
//        button[1].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                linearLayout.setVisibility(view.INVISIBLE);
//                btnSwitch.setChecked(false);
//            }
//        });
    }
}