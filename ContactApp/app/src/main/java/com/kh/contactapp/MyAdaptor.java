package com.kh.contactapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdaptor extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

  private ArrayList<ContactItem> contactItems;

  public MyAdaptor(ArrayList<ContactItem> alist) {
    this.contactItems = alist;
  }

  // 아이템 뷰를 저장하는 뷰홀더
  static class MyViewHolder extends RecyclerView.ViewHolder{
    ImageView pic;
    TextView name;
    TextView tel;

    MyViewHolder(@NonNull View itemView) {
      super(itemView);
      pic   = itemView.findViewById(R.id.pic);
      name  = itemView.findViewById(R.id.name);
      tel   = itemView.findViewById(R.id.tel);
    }
  }

  //아이템 뷰를 위한 뷰홀더 객체를 생성하여 리턴
  @NonNull
  @Override
  public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

    Context context = parent.getContext();
    LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    View view = inflater.inflate(R.layout.item, parent, false);
    MyViewHolder myViewHolder = new MyViewHolder(view);

    return myViewHolder;
  }

  //position에 해당하는 데이터를 뷰홀더의 아이템뷰에 표시
  @Override
  public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
    ContactItem contactItem = contactItems.get(position);

    MyViewHolder myViewHolder = (MyViewHolder)holder;
    myViewHolder.pic.setBackground(contactItem.getPic());
    myViewHolder.name.setText(contactItem.getName());
    myViewHolder.tel.setText(contactItem.getTel());
  }

  //아이템 갯수 반환
  @Override
  public int getItemCount() {
    return contactItems.size();
  }
}
