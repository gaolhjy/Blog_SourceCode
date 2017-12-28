package com.glh.serializabledemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * <pre>
 *     author : 高磊华
 *     e-mail : 984992087@qq.com
 *     time   : 2017/12/28
 *     desc   : Serializable接收界面
 * </pre>
 */
public class SerializableActivity extends Activity {


    private TextView mTvDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mTvDate = (TextView) findViewById(R.id.mTvDate);

        Intent intent = getIntent();

        // 关键方法：getSerializableExtra ，我们的类是实现了Serializable接口的，所以写这个方法获得对象
        // public class Person implements Serializable

        Person per = (Person) intent.getSerializableExtra("put_ser_test");

        mTvDate.setText("名字：" + per.getName() + "\n"
                + "年龄：" + per.getAge());

    }
}
