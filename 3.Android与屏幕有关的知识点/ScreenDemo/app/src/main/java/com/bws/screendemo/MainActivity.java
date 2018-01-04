package com.bws.screendemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * <pre>
 *     author : 高磊华
 *     e-mail : 984992087@qq.com
 *     time   : 2018/01/04
 *     desc   : 程序的入口
 * </pre>
 */


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);
        findViewById(R.id.btn_3).setOnClickListener(this);
        findViewById(R.id.btn_4).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_1:
                startActivity(new Intent(this, MeasureActivity.class));
                break;
            case R.id.btn_2:
                startActivity(new Intent(this, CommonScreenshotActivity.class));
                break;
            case R.id.btn_3:
                startActivity(new Intent(this, LvScreenshotActivity.class));
                break;
            case R.id.btn_4:
                startActivity(new Intent(this, RvScreenshotActivity.class));
                break;
        }
    }

}
