package com.bws.screendemo;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

/**
 * <pre>
 *     author : 高磊华
 *     e-mail : 984992087@qq.com
 *     time   : 2018/01/04
 *     desc   : Listview的截屏
 * </pre>
 */


public class LvScreenshotActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView iv;
    private ListView  mListView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_screenshot_lv);

        mListView = (ListView) findViewById(R.id.lv);
        iv = (ImageView) findViewById(R.id.iv);

        LvTestAdapter adapter = new LvTestAdapter();
        mListView.setAdapter(adapter);

        findViewById(R.id.btn_4).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_4:
                Bitmap bitmap4 =
                        DisplayUtils.shotListView(mListView);

                iv.setImageBitmap(bitmap4);
                break;
        }
    }
}
