package com.lulu.wxui;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lulu.wxui.adapter.HomeAdapter;
import com.lulu.wxui.mode.HomeBean;
import com.lulu.wxui.widget.HomeLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * create by zyj
 * on 2019/5/24
 **/
public class UiFragmentDialog extends DialogFragment {

    private RecyclerView recyclerView;
    private List<HomeBean> mHomeBeanList;
    private HomeAdapter mHomeAdapter;

    public static UiFragmentDialog show(FragmentActivity activity, ArrayList<HomeBean> homeBeans) {
        UiFragmentDialog dialog = new UiFragmentDialog();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("data", homeBeans);
        dialog.setArguments(bundle);
        dialog.show(activity.getSupportFragmentManager(), "UiFragmentDialog");
        return dialog;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        HomeLayout homeLayout = new HomeLayout(getContext());
        recyclerView = homeLayout.getRecyclerView();
        initData();
        return homeLayout;
    }

    private void initData() {
//        mHomeBeanList = new ArrayList<>();
        mHomeBeanList = getArguments().getParcelableArrayList("data");
        mHomeAdapter = new HomeAdapter(getContext(), mHomeBeanList);
        recyclerView.setAdapter(mHomeAdapter);
    }


}
