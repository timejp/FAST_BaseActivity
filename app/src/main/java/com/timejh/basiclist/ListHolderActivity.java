package com.timejh.basiclist;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class ListHolderActivity extends AppCompatActivity {

    ArrayList<User> datas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_holder);

        load();

        ListView listView = (ListView) findViewById(R.id.listview);
        CustomHolderAdapter customHolderAdapter = new CustomHolderAdapter(this, datas);
        listView.setAdapter(customHolderAdapter);
    }

    private void load() {
        Random random = new Random();
        // datas에 100명의 User를 생성해서 담는다
        for (int i = 0; i < 100; i++) {
            User user = new User();
            user.id = i + 1;
            user.name = "홍길동" + i + 1;
            user.age = (random.nextInt(80)) + 1;
            datas.add(user);
        }
    }

    class CustomHolderAdapter extends BaseAdapter {

        private ArrayList<User> datas;
        private LayoutInflater inflater;

        public CustomHolderAdapter(Context context, ArrayList<User> datas) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            this.datas = datas;
        }

        @Override
        public int getCount() {
            return datas.size();
        }

        @Override
        public Object getItem(int position) {
            return datas.get(position);
        }

        @Override
        public long getItemId(int position) {
            return datas.get(position).id;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if(convertView == null)
                convertView = inflater.inflate(R.layout.list_holder_item, null);

            TextView tv_id = (TextView) convertView.findViewById(R.id.tv_id);
            TextView tv_name = (TextView) convertView.findViewById(R.id.tv_name);
            TextView tv_age = (TextView) convertView.findViewById(R.id.tv_age);

            tv_id.setText(datas.get(position).id + "");
            tv_name.setText(datas.get(position).name);
            tv_age.setText(datas.get(position).age + "");

            return convertView;
        }
    }
}
