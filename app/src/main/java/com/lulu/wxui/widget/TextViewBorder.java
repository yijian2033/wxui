package com.lulu.wxui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * create by zyj
 * on 2019/5/28
 **/
public class TextViewBorder extends AppCompatTextView {
    private static final int STROKE_WIDTH = 2;
    private int borderCol;

    private Paint borderPaint;

    public TextViewBorder(Context context) {
        this(context, null);
    }

    public TextViewBorder(Context context, AttributeSet attrs) {
        this(context, attrs, 0);

    }

    public TextViewBorder(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }


    private void initPaint() {
        borderPaint = new Paint();
        borderPaint.setStyle(Paint.Style.STROKE);
        borderPaint.setStrokeWidth(STROKE_WIDTH);
        borderPaint.setAntiAlias(true);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        if (0 == this.getText().toString().length())
            return;
        borderPaint.setColor(Color.parseColor("#01BC66"));
        int w = this.getMeasuredWidth();
        int h = this.getMeasuredHeight();
        RectF r = new RectF(2, 2, w - 2, h - 2);
        canvas.drawRoundRect(r, 5, 5, borderPaint);
        super.onDraw(canvas);
    }

    public int getBordderColor() {
        return borderCol;
    }

    public void setBorderColor(int newColor) {
        borderCol = newColor;
        invalidate();
        requestLayout();
    }

}

