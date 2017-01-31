package com.timejh.basiclist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private TextView tv_number;
    private TextView tv_day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tv_number = (TextView) findViewById(R.id.tv_number);
        tv_day = (TextView) findViewById(R.id.tv_day);
        Intent intent = getIntent();
        String textNum = intent.getStringExtra("textNum");
        String textDay = intent.getStringExtra("textDay");
        if (textNum != null)
            tv_number.setText(textNum);
        if (textDay != null)
            tv_day.setText(textDay);
    }
}
