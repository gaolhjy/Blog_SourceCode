package com.bws.activitydemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.bws.activitydemo.launch.A1;
import com.bws.activitydemo.launch.B1;
import com.bws.activitydemo.launch.C1;
import com.bws.activitydemo.launch.D1;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);
        findViewById(R.id.btn_3).setOnClickListener(this);
        findViewById(R.id.btn_4).setOnClickListener(this);
        findViewById(R.id.btn_5).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_1:
                startActivity(new Intent(MainActivity.this, LifecyActivity.class));
                break;
            case R.id.btn_2:
                startActivity(new Intent(MainActivity.this, A1.class));
                break;
            case R.id.btn_3:
                startActivity(new Intent(MainActivity.this, B1.class));
                break;
            case R.id.btn_4:
                startActivity(new Intent(MainActivity.this, C1.class));
                break;
            case R.id.btn_5:
                startActivity(new Intent(MainActivity.this, D1.class));
                break;
        }
    }
}
