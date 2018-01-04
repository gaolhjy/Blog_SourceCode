package com.bws.screendemo;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

/**
 * <pre>
 *     author : 高磊华
 *     e-mail : 984992087@qq.com
 *     time   : 2018/01/04
 *     desc   : 截屏
 * </pre>
 */


public class CommonScreenshotActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView iv;
    private ScrollView mScrollView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_screenshot_common);


        mScrollView = (ScrollView) findViewById(R.id.scrollView);
        iv = (ImageView) findViewById(R.id.iv);

        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);
        findViewById(R.id.btn_3).setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_1:
                Bitmap bitmap1 =
                        DisplayUtils.snapShotWithStatusBar(this);

                iv.setImageBitmap(bitmap1);
                break;
            case R.id.btn_2:
                Bitmap bitmap2 =
                        DisplayUtils.snapShotWithoutStatusBar(this);

                iv.setImageBitmap(bitmap2);
                break;
            case R.id.btn_3:
                Bitmap bitmap3 =
                        DisplayUtils.shotScrollView(mScrollView);

                iv.setImageBitmap(bitmap3);
                break;
        }
    }
}
