package com.lulu.wxui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lulu.wxui.util.AppUtil;
import com.lulu.wxui.util.DensityUtil;

/**
 * create by zyj
 * on 2019/5/24
 **/
public class HomeItemLayout extends LinearLayout {

    private ImageView ivIcon;
    private TextView tvName;

    public HomeItemLayout(Context context) {
        this(context, null);
    }

    public HomeItemLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public HomeItemLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setOrientation(VERTICAL);
        init(context);
    }

    private void init(Context context) {
        ivIcon = new ImageView(context);
        ivIcon.setAdjustViewBounds(true);
        ivIcon.setPadding(DensityUtil.dip2px(context, 2), DensityUtil.dip2px(context, 2), DensityUtil.dip2px(context, 2), DensityUtil.dip2px(context, 2));
        ivIcon.setScaleType(ImageView.ScaleType.CENTER_CROP);
        LinearLayout.LayoutParams mImageViewRLP = new LinearLayout.LayoutParams(AppUtil.getScreenWidth(context) / 4, AppUtil.getScreenWidth(context) / 4);
        mImageViewRLP.gravity = Gravity.CENTER;
        addView(ivIcon, mImageViewRLP);

        tvName = new TextView(context);
        LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        params.gravity = Gravity.CENTER;
        params.topMargin = 10;
        addView(tvName, params);
    }

    public ImageView getIvIcon() {
        return ivIcon;
    }

    public TextView getTvName() {
        return tvName;
    }
}
