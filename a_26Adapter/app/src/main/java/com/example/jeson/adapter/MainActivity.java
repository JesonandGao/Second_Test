package com.example.jeson.adapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        String[] menu = {"语文", "数学", "英语", "物理", "化学", "历史", "生物"};
//        ArrayAdapter<String> my_adapter =
//                new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, menu);
//        ListView my_lv = (ListView) findViewById(R.id.my_lv);
//        my_lv.setAdapter(my_adapter);

//        ArrayAdapter<CharSequence> my_adapter =
//                ArrayAdapter.createFromResource(this, R.array.my_menus, android.R.layout.simple_expandable_list_item_1);
//
//        ListView my_lv = (ListView) findViewById(R.id.my_lv);
//        my_lv.setAdapter(my_adapter);
    }
}
