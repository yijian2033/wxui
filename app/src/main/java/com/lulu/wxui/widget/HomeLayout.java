package com.lulu.wxui.widget;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

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
        recyclerView.setLayoutManager(new GridLayoutManager(mContext,3));
        addView(recyclerView);
    }


}
