package com.timejh.basiclist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

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
        return null;
    }

    // ListView에서의 getView를 대체하는 함수
    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    // Recycle View 에서 사용하는 뷰 홀더
    // 이 뷰홀더를 사용하는 Adapter는 generic으로 선언된 부모 객체를 상속받아야 함
    public class CustomViewHolder extends RecyclerView.ViewHolder {

        public CustomViewHolder(View itemView) {
            super(itemView);
        }
    }
}
