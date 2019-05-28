package com.lulu.wxui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import com.lulu.wxui.util.DensityUtil;

/**
 * create by zyj
 * on 2019/5/28
 * <p>
 * 圆角矩形的绘制，用于做背景或者按钮
 **/
public class RoundRectShape extends View {

    private Paint mPaint;//画笔
    private Context mContext;

    public RoundRectShape(Context context) {
        this(context, null);
    }

    public RoundRectShape(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RoundRectShape(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        init();
    }


    private void init() {
        mPaint = new Paint();
        mPaint.setColor(Color.parseColor("#01BC66"));//设置画笔颜色
//        mPaint.setStyle(Paint.Style.FILL);//设置画笔模式为填充
        mPaint.setAntiAlias(true);//是否抗锯齿
        mPaint.setStrokeWidth(DensityUtil.dip2px(mContext, 1)); //设置画笔宽度为10px
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 第一种
        RectF rectF = new RectF(100,100,800,400);
        canvas.drawRoundRect(rectF,30,30,mPaint);

    }
}
