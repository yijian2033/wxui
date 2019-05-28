package com.lulu.wxui.dialog;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lulu.wxui.layout.HomeLayout;

/**
 * create by zyj
 * on 2019/5/27
 **/
public class FriendDialogFragment extends DialogFragment {

    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        HomeLayout homeLayout = new HomeLayout(getContext());
        recyclerView = homeLayout.getRecyclerView();
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        initData();
        initListener();
        return homeLayout;
    }


    private void initListener() {

    }

    private void initData() {

    }


}
