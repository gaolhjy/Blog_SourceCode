package com.glh.fabdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *     author : 高磊华
 *     e-mail : 984992087@qq.com
 *     time   : 2018/04/01
 *     desc   : 添加边框的fab
 * </pre>
 */


public class AddBorderFabActivity extends AppCompatActivity {

    private List<String> testList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addborder);

        for (int i = 0; i < 20; i++) {
            testList.add("第" + i + "条测试数据");
        }

        RvAdapter rvAdapter = new RvAdapter(this, testList);
        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);

        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(rvAdapter);
    }
}