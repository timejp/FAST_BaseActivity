package com.timejh.basiclist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bt_listActivity;
    private Button bt_listHolderActivity;
    private Button bt_recyclerActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_listActivity = (Button) findViewById(R.id.bt_listActivity);
        bt_listHolderActivity = (Button) findViewById(R.id.bt_listHolderActivity);
        bt_recyclerActivity = (Button) findViewById(R.id.br_recyclerActivity);

        bt_listActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });

        bt_listHolderActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListHolderActivity.class);
                startActivity(intent);
            }
        });

        bt_recyclerActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RecyclerActivity.class);
                startActivity(intent);
            }
        });
    }
}
