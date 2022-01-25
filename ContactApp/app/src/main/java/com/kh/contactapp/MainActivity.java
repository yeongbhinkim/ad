package com.kh.contactapp;

import android.graphics.drawable.Drawable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
  private RecyclerView recyclerView;
  private MyAdaptor myAdaptor;

  private Drawable pic;
  private String name;
  private String tel;

  private ArrayList<ContactItem> contactItems;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    contactItems = new ArrayList<>();
    recyclerView = findViewById(R.id.recyclerView);
    recyclerView.setLayoutManager(
        new LinearLayoutManager(this, RecyclerView.VERTICAL, false)
    );

    myAdaptor = new MyAdaptor(contactItems);
    recyclerView.setAdapter(myAdaptor);

    int[] pics = { R.drawable.mov01,R.drawable.mov02,R.drawable.mov03,R.drawable.mov04,R.drawable.mov05,
        R.drawable.mov06,R.drawable.mov07,R.drawable.mov08,R.drawable.mov09,R.drawable.mov10
    };
    String[] names = {"홍길동1","홍길동2","홍길동3","홍길동4","홍길동5",
        "홍길동6","홍길동7","홍길동8","홍길동9","홍길동10"};
    String[] tels = {"010-1111-1111","010-1111-1112","010-1111-1113","010-1111-1114","010-1111-1115",
        "010-1111-1116","010-1111-1117","010-1111-1118","010-1111-1119","010-1111-1110"};

    for (int i = 0; i < 10; i++) {
      pic = ResourcesCompat.getDrawable(getResources(), pics[i], null);
      addItem(pic, names[i] + " - " + (i+1) , tels[i]);
    }

    myAdaptor.notifyDataSetChanged();
  }

  private void addItem(Drawable pic, String name, String tel) {
    contactItems.add(new ContactItem(pic,name,tel));
  }
}