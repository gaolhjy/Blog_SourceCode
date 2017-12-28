package com.glh.serializabledemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


/**
 * 进行Android开发的时候，我们都知道不能将对象的引用传给Activities或者Fragments，
 * 我们需要将这些对象放到一个Intent或者Bundle里面，然后再传递。
 *
 *
 * Android中Intent如果要传递类对象，可以通过两种方式实现。
 * 方式一：Serializable，要传递的类实现Serializable接口传递对象，
 * 方式二：Parcelable，要传递的类实现Parcelable接口传递对象。
 *
 * Serializable（Java自带）：
 * Serializable是序列化的意思，表示将一个对象转换成可存储或可传输的状态。序列化后的对象可以在网络上进行传输，也可以存储到本地。
 *
 * Parcelable（android 专用）：
 * 除了Serializable之外，使用Parcelable也可以实现相同的效果，
 * 不过不同于将对象进行序列化，Parcelable方式的实现原理是将一个完整的对象进行分解，
 * 而分解后的每一部分都是Intent所支持的数据类型，这样也就实现传递对象的功能了。


 要求被传递的对象必须实现上述2种接口中的一种才能通过Intent直接传递。
 */
public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.mTvOpenNew).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SerializableActivity.class);

                Person person = new Person();
                person.setName("如花");
                person.setAge(18);

                // 传输方式一，intent直接调用putExtra
                // public Intent putExtra(String name, Serializable value)
                intent.putExtra("put_ser_test", person);

                // 传输方式二，intent利用putExtras（注意s）传入bundle
                /**
                 Bundle bundle = new Bundle();
                 bundle.putSerializable("bundle_ser",person);
                 open.putExtras(bundle);
                 */


                startActivity(intent);
            }
        });


        // 采用Parcelable的方式
        findViewById(R.id.mTvOpenThird).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mTvOpenThird = new Intent(MainActivity.this,ParcelableActivity.class);

                Pen tranPen = new Pen();
                tranPen.setColor("big red");
                tranPen.setSize(98);
                // public Intent putExtra(String name, Parcelable value)
                mTvOpenThird.putExtra("parcel_test",tranPen);

                startActivity(mTvOpenThird);

            }
        });

    }
}
