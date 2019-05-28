package com.lulu.wxui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lulu.wxui.mode.BaseItem;

import java.util.List;

/**
 * create by zyj
 * on 2019/5/27
 **/
public class RVBaseAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public static final int VIEW_TYPE_01 = 0xa01;
    public static final int VIEW_TYPE_02 = 0xa02;
    public static final int VIEW_TYPE_03 = 0xa03;
    public static final int VIEW_TYPE_04 = 0xa04;
    public static final int VIEW_TYPE_05 = 0xa05;

    private Context mContext;
    private List<BaseItem> mItems;

    public RVBaseAdapter(Context context, List<BaseItem> items) {
        this.mContext = context;
        this.mItems = items;
    }


    @Override
    public int getItemViewType(int position) {
        return mItems.get(position).getType();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        BaseItem baseItem = mItems.get(i);
        switch (baseItem.getType()){
            case VIEW_TYPE_01:
                TextView textView = new TextView(mContext);
                return new TextViewHolder(textView);
            case VIEW_TYPE_02:
                break;
            case VIEW_TYPE_03:
                break;
            case VIEW_TYPE_04:
                break;
            case VIEW_TYPE_05:
                break;
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public class TextViewHolder extends RecyclerView.ViewHolder {
        TextView tvHead;

        public TextViewHolder(@NonNull View itemView) {
            super(itemView);
            tvHead = (TextView) itemView;
        }

    }

}
