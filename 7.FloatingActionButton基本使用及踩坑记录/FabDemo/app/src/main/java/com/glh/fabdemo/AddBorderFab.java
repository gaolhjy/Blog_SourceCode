package com.glh.fabdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;
import android.util.Log;

/**
 * <pre>
 *     author : 高磊华
 *     e-mail : 984992087@qq.com
 *     time   : 2018/04/01
 *     desc   : 添加边框的fab
 * </pre>
 */


public class AddBorderFab extends FloatingActionButton {

    private Paint  paint;
    private Canvas canvas;

    public AddBorderFab(Context context) {
        super(context);
        initView();
    }

    public AddBorderFab(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public AddBorderFab(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {
        canvas = new Canvas();
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth((float) 1.0);
        paint.setStyle(Paint.Style.STROKE);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Log.e("测量", "onDraw: " + getMeasuredWidth() + "....." + getMeasuredHeight());

        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, getMeasuredWidth() / 2
                - 1, paint);

        canvas.save();
        super.onDraw(canvas);
        canvas.restore();
    }

}
