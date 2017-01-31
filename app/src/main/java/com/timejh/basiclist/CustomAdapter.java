package com.timejh.basiclist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by tokijh on 2017. 1. 31..
 */

public class CustomAdapter extends BaseAdapter {

    private String[] datas;

    private LayoutInflater inflater;

    public CustomAdapter(Context context, String[] datas) {
        // getView 에서 사용할 xml 레이아웃을 객체로 변환해 주는 inflater를 가져온다.
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.datas = datas;
    }

    @Override
    public int getCount() {
        return datas.length;
    }

    @Override
    public Object getItem(int position) {
        return datas[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //xml를 View객체로 만든다
        if(convertView == null)
            convertView = inflater.inflate(R.layout.list_item, null);
        TextView txtNo = (TextView) convertView.findViewById(R.id.txtNo);
        TextView txtDay = (TextView) convertView.findViewById(R.id.txtDay);
        txtNo.setText(position + 1 + "");
        txtDay.setText(datas[position]);
        return convertView;
    }
}
