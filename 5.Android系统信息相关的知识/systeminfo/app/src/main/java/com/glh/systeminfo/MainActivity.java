package com.glh.systeminfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * <pre>
 *     author : 高磊华
 *     e-mail : 984992087@qq.com
 *     time   : 2017/12/23
 *     desc   : 程序入口
 * </pre>
 */


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_system).setOnClickListener(this);
        findViewById(R.id.btn_pm).setOnClickListener(this);
        findViewById(R.id.btn_am).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_system:
                startActivity(new Intent(MainActivity.this, SystemActivity.class));
                break;
            case R.id.btn_pm:
                startActivity(new Intent(MainActivity.this, PMInfoActivity.class));
                break;
            case R.id.btn_am:
                startActivity(new Intent(MainActivity.this, AMProcessActivity.class));
                break;
        }
    }
}
