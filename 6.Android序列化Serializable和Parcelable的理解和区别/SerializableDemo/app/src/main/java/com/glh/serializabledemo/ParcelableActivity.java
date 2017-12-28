package com.glh.serializabledemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * User: LJM
 * Date&Time: 2016-02-22 & 14:47
 * Describe: Describe Text
 */
public class ParcelableActivity extends Activity{

    private TextView mTvThirdDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        mTvThirdDate = (TextView) findViewById(R.id.mTvThirdDate);

//        Intent intent = getIntent();
//        Pen pen = (Pen)intent.getParcelableExtra("parcel_test");
        // 注意采用的方法是getParcelableExtra
        Pen pen = (Pen)getIntent().getParcelableExtra("parcel_test");


        mTvThirdDate = (TextView) findViewById(R.id.mTvThirdDate);
        mTvThirdDate.setText("颜色:"+pen.getColor()+"\n"
                            +"大小:"+pen.getSize());

    }
}
