package com.glh.broadcastdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * <pre>
 *     author : 高磊华
 *     e-mail : 984992087@qq.com
 *     desc   : 动态广播接受者
 * </pre>
 */


public class MyDTReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        String value = intent.getStringExtra("value2");
        Toast.makeText(context, value, Toast.LENGTH_SHORT).show();
    }
}


