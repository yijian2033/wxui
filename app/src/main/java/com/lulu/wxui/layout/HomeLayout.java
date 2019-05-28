package com.lulu.wxui.layout;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.lulu.wxui.util.DensityUtil;

/**
 * create by zyj
 * on 2019/5/24
 * 外部布局
 **/
public class HomeLayout extends RelativeLayout {

    private Context mContext;

    private RecyclerView recyclerView;

    public RecyclerView getRecyclerView() {
        return recyclerView;
    }


    public HomeLayout(Context context) {
        this(context, null);
    }

    public HomeLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);

    }

    public HomeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        init();
    }

    private void init() {
        recyclerView = new RecyclerView(mContext);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.leftMargin = DensityUtil.dip2px(getContext(),10);
        params.rightMargin = DensityUtil.dip2px(getContext(),10);
        recyclerView.setLayoutParams(params);
        addView(recyclerView);
    }


}
