package com.kh.contactapp;

import android.graphics.drawable.Drawable;

public class ContactItem {
  private Drawable pic;   // 사진
  private String name;    // 이름
  private String tel;     // 연락처

  public ContactItem(Drawable pic, String name, String tel) {
    this.pic = pic;
    this.name = name;
    this.tel = tel;
  }

  public Drawable getPic() {
    return pic;
  }

  public String getName() {
    return name;
  }

  public String getTel() {
    return tel;
  }
}
