package com.timejh.basiclist;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by tokijh on 2017. 1. 31..
 */

public class Data {
    private ArrayList<User> datas;

    public Data() {
        datas = new ArrayList<>();
        load();
    }

    private void load() {
        Random random = new Random();
        // datas에 100명의 User를 생성해서 담는다
        for (int i = 0; i < 100; i++) {
            User user = new User();
            user.id = i + 1;
            user.name = "홍길동" + (i + 1);
            user.age = (random.nextInt(80)) + 1;
            datas.add(user);
        }
    }

    public ArrayList<User> getDatas() {
        return datas;
    }
}
