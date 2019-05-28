package com.lulu.wxui.layout;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lulu.wxui.util.DensityUtil;

import java.lang.reflect.Type;

/**
 * create by zyj
 * on 2019/5/28
 **/
public class DetectionLayout extends LinearLayout {

    private Context mContext;

    public DetectionLayout(Context context) {
        this(context, null);
    }

    public DetectionLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DetectionLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        init();
    }

    private void init() {
        RelativeLayout layout = new RelativeLayout(mContext);
        LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, DensityUtil.dip2px(mContext, 56));
        layout.setLayoutParams(params);
        //标题
        TextView tvTitle = new TextView(mContext);
        tvTitle.setText("检测僵尸粉");
        tvTitle.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        tvTitle.setTextColor(Color.parseColor("#1A1A1A"));
        tvTitle.setTextSize(17);

    }


}
