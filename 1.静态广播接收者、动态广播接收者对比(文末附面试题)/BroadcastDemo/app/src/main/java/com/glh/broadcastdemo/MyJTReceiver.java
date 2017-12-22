package com.glh.broadcastdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * <pre>
 *     author : 高磊华
 *     e-mail : 984992087@qq.com
 *     desc   : 静态的广播接收者（需要在清单文件中配置）：
 * </pre>
 */


public class MyJTReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        String value = intent.getStringExtra("value1");
        Toast.makeText(context, value, Toast.LENGTH_SHORT).show();
    }
}