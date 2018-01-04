package com.bws.screendemo;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

/**
 * <pre>
 *     author : 高磊华
 *     e-mail : 984992087@qq.com
 *     time   : 2018/01/04
 *     desc   : recyclerview的截屏
 * </pre>
 */


public class RvScreenshotActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView    iv;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_screenshot_rv);

        mRecyclerView = (RecyclerView) findViewById(R.id.rv);
        iv = (ImageView) findViewById(R.id.iv);

        RvTestAdapter adapter = new RvTestAdapter();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager
                .VERTICAL, false));
        mRecyclerView.setAdapter(adapter);

        findViewById(R.id.btn_5).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_5:
                Bitmap bitmap5 =
                        DisplayUtils.shotRecyclerView(mRecyclerView);

                iv.setImageBitmap(bitmap5);
                break;
        }
    }
}
