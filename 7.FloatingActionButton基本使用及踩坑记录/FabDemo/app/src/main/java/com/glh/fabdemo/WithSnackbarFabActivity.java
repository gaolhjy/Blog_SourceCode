package com.glh.fabdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * <pre>
 *     author : 高磊华
 *     e-mail : 984992087@qq.com
 *     time   : 2018/04/01
 *     desc   : fab结合snackbar一起使用(错误的用法)
 * </pre>
 */


public class WithSnackbarFabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        boolean useSnackIsRight = getIntent().getBooleanExtra("useSnackIsRight", false);

        if (useSnackIsRight) {
            setContentView(R.layout.activity_withsnack_right);
        } else {
            setContentView(R.layout.activity_withsnack_wrong);
        }


        findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "温馨提示", Snackbar.LENGTH_SHORT).setAction("是否删除", new View
                        .OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //do something
                        Toast.makeText(WithSnackbarFabActivity.this, "已删除", Toast.LENGTH_SHORT)
                                .show();
                    }
                }).show();
            }
        });

    }
}