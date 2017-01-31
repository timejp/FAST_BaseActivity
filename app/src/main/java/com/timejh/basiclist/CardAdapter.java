package com.timejh.basiclist;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by tokijh on 2017. 1. 31..
 */

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CustomViewHolder> {

    ArrayList<User> datas;
    Context context;

    public CardAdapter(ArrayList<User> datas, Context context) {
        this.datas = datas;
        this.context = context;
    }
    // View 를 생성해서 홀더에 저장하는 역할
    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_card_item, parent, false);
        return new CustomViewHolder(view);
    }

    // ListView에서의 getView를 대체하는 함수
    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        final User user = datas.get(position);
        holder.tv_id.setText(user.id + "");
        holder.tv_name.setText(user.name);
        holder.tv_age.setText(user.age + "");

        // CardView에 ClickListener를 달아서 동작시킨다.
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("textNum", user.id + "");
                intent.putExtra("textDay", user.name);

                context.startActivity(intent);
            }
        });

        Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
        holder.cardView.setAnimation(animation);
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    // Recycle View 에서 사용하는 뷰 홀더
    // 이 뷰홀더를 사용하는 Adapter는 generic으로 선언된 부모 객체를 상속받아야 함
    public class CustomViewHolder extends RecyclerView.ViewHolder {

        TextView tv_id;
        TextView tv_name;
        TextView tv_age;

        CardView cardView;

        public CustomViewHolder(View itemView) {
            super(itemView);
            tv_id = (TextView) itemView.findViewById(R.id.tv_id);
            tv_name = (TextView) itemView.findViewById(R.id.tv_name);
            tv_age = (TextView) itemView.findViewById(R.id.tv_age);

            cardView = (CardView) itemView.findViewById(R.id.cardView);
        }
    }
}
