package com.glh.broadcastdemo;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


/**
 * <pre>
 *     author : 高磊华
 *     e-mail : 984992087@qq.com
 *     desc   : 注册广播.动态注册一定要记得在onDestroy销毁：
 * </pre>
 */


public class MainActivity extends AppCompatActivity {

    private MyDTReceiver receiver;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        receiver = new MyDTReceiver();
        IntentFilter filter = new IntentFilter();
        filter.addAction("csdn.net.test202");
        //注册动态广播
        registerReceiver(receiver, filter);
    }


    // 发送静态广播
    public void click1(View v) {
        Intent intent = new Intent();
        intent.setAction("csdn.net.test201");
        intent.putExtra("value1", "我是静态广播字符串");
        sendBroadcast(intent);
    }


    //发送动态广播
    public void click2(View v) {
        Intent intent = new Intent();
        intent.setAction("csdn.net.test202");
        intent.putExtra("value2", "我是动态广播字符串");
        sendBroadcast(intent);
    }


    // 当activity被销毁的时候调用(动态广播需要手动注销)
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // 注销
        unregisterReceiver(receiver);
    }


    //跳转到本地广播使用方法界面
    public void click3(View v) {
        startActivity(new Intent(this,LocalBroadcastActivity.class));
    }

}




