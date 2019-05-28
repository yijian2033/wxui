package com.lulu.wxui.layout;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lulu.wxui.util.AppUtil;
import com.lulu.wxui.util.DensityUtil;
import com.lulu.wxui.widget.TextViewBorder;

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
        LayoutParams params = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.setMargins(0,DensityUtil.dip2px(getContext(),21),0,DensityUtil.dip2px(getContext(),12));
        setLayoutParams(params);
        init(context);
    }

    private void init(Context context) {
        ivIcon = new ImageView(context);
        ivIcon.setAdjustViewBounds(true);
        ivIcon.setScaleType(ImageView.ScaleType.CENTER_CROP);
        LinearLayout.LayoutParams mImageViewRLP = new LinearLayout.LayoutParams(DensityUtil.dip2px(context, 52), DensityUtil.dip2px(context, 52));
        mImageViewRLP.gravity = Gravity.CENTER;
        addView(ivIcon, mImageViewRLP);

        tvName = new TextViewBorder(context);
        tvName.setBackgroundColor(Color.YELLOW);
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

    public LinearLayout getItemLayout() {
        return this;
    }
}
