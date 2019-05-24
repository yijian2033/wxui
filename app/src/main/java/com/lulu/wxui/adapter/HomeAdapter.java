package com.lulu.wxui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lulu.wxui.mode.HomeBean;
import com.lulu.wxui.widget.HomeItemLayout;

import java.util.List;

/**
 * create by zyj
 * on 2019/5/24
 **/
public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    private Context mContext;
    private List<HomeBean> mDatas;

    public HomeAdapter(Context context, List<HomeBean> datas) {
        this.mContext = context;
        this.mDatas = datas;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(new HomeItemLayout(mContext));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        HomeBean homeBean = mDatas.get(i);
        viewHolder.ivIcon.setImageResource(homeBean.getResourceId());
        viewHolder.tvName.setText(homeBean.getName());
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivIcon;
        TextView tvName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivIcon = ((HomeItemLayout) itemView).getIvIcon();
            tvName = ((HomeItemLayout) itemView).getTvName();
        }
    }

    public void setmDatas(List<HomeBean> mDatas) {
        this.mDatas = mDatas;
        notifyDataSetChanged();
    }
}
