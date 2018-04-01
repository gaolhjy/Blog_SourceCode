package com.glh.fabdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

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
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_1:   //基本使用
                startActivity(new Intent(this, CommonActivity.class));
                break;
            case R.id.btn_2:  //与recyclerview结合起来使用
                startActivity(new Intent(this, RecyclerViewFabActivity.class));
                break;
            case R.id.btn_3:  //FAB实现边框效果
                startActivity(new Intent(this, AddBorderFabActivity.class));
                break;
            case R.id.btn_4:    //与snackbar结合使用(错误用法)
                Intent intent = new Intent(this, WithSnackbarFabActivity.class);
                intent.putExtra("useSnackIsRight", false);
                startActivity(intent);
                break;
            case R.id.btn_5:    //与snackbar结合使用(正确用法)
                Intent intent1 = new Intent(this, WithSnackbarFabActivity.class);
                intent1.putExtra("useSnackIsRight", true);
                startActivity(intent1);
                break;
        }
    }
}
