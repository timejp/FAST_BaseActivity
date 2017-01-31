package com.timejh.basiclist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by tokijh on 2017. 1. 31..
 */

public class RecyclerCustomAdapter extends RecyclerView.Adapter<RecyclerCustomAdapter.CustomViewHolder> {

    ArrayList<User> datas;
    int itemLayout;

    public RecyclerCustomAdapter(ArrayList<User> datas, int itemLayout) {
        this.datas = datas;
        this.itemLayout = itemLayout;
    }
    // View 를 생성해서 홀더에 저장하는 역할
    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(itemLayout, parent, false);
        return new CustomViewHolder(view);
    }

    // ListView에서의 getView를 대체하는 함수
    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        User user = datas.get(position);
        holder.tv_id.setText(user.id + "");
        holder.tv_name.setText(user.name);
        holder.tv_age.setText(user.age + "");
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    // Recycle View 에서 사용하는 뷰 홀더
    // 이 뷰홀더를 사용하는 Adapter는 generic으로 선언된 부모 객체를 상속받아야 함
    public class CustomViewHolder extends RecyclerView.ViewHolder {

        TextView tv_id;
        TextView tv_name;
        TextView tv_age;

        public CustomViewHolder(View itemView) {
            super(itemView);
            tv_id = (TextView) itemView.findViewById(R.id.tv_id);
            tv_name = (TextView) itemView.findViewById(R.id.tv_name);
            tv_age = (TextView) itemView.findViewById(R.id.tv_age);
        }
    }
}
