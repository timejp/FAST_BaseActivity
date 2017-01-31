package com.timejh.basiclist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerCardActivity extends AppCompatActivity {

    ArrayList<User> datas = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_card);

        Data data = new Data();
        datas = data.getDatas();

        // 1. Recycler View 가져오기
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycleView);
        // 2. Adapter 설정하기
        CardAdapter cardAdapter = new CardAdapter(datas, this);
        // 3. Recycler View Adapter 세팅하기
        recyclerView.setAdapter(cardAdapter);
        // 4. Recycler View 메니져 등록하기... (뷰의 모양 결정 : 그리드, 리스트, 비대칭 뷰)
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2, LinearLayoutManager.VERTICAL, false));
    }
}
