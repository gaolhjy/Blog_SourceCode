package com.bws.activitydemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * author : 高磊华
 * e-mail : 984992087@qq.com
 * time   : 2017\12\16 0016
 * desc   : 本界面用于测试生命周期
 */

public class LifecyActivity extends AppCompatActivity {

    private static final String TAG = "LifecyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_lifecy);
        Log.e(TAG, "生命周期........." + "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "生命周期........." + "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "生命周期........." + "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "生命周期........." + "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "生命周期........." + "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "生命周期........." + "onDestroy");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "生命周期........." + "onRestart");
    }
}
