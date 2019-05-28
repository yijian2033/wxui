package com.lulu.wxui.dialog;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.lulu.wxui.adapter.HomeAdapter;
import com.lulu.wxui.mode.HomeBean;
import com.lulu.wxui.layout.HomeLayout;
import com.lulu.wxui.util.AppUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * create by zyj
 * on 2019/5/24
 **/
public class HomeDialogFragment extends DialogFragment {

    private RecyclerView recyclerView;
    private List<HomeBean> mHomeBeanList;
    private HomeAdapter mHomeAdapter;

    public static HomeDialogFragment show(FragmentActivity activity, ArrayList<HomeBean> homeBeans) {
        HomeDialogFragment dialog = new HomeDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("data", homeBeans);
        dialog.setArguments(bundle);
        dialog.show(activity.getSupportFragmentManager(), "HomeDialogFragment");
        return dialog;
    }


    @Override
    public void onResume() {
        super.onResume();
        getDialog().getWindow().setLayout(AppUtil.getScreenWidth(getActivity()), ViewGroup.LayoutParams.WRAP_CONTENT);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        HomeLayout homeLayout = new HomeLayout(getContext());
        recyclerView = homeLayout.getRecyclerView();
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 4));
        initData();
        initListener();
        return homeLayout;
    }

    private void initData() {
//        mHomeBeanList = new ArrayList<>();
        mHomeBeanList = getArguments().getParcelableArrayList("data");
        mHomeAdapter = new HomeAdapter(getContext(), mHomeBeanList);
        recyclerView.setAdapter(mHomeAdapter);
    }

    private void initListener() {
        mHomeAdapter.setListener(new HomeAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                //todo 跳转去想去的地方
                Toast.makeText(getActivity(), "点击：" + mHomeBeanList.get(position).getName(), Toast.LENGTH_SHORT).show();
                toSetting(position);
            }
        });
    }

    private void toSetting(int position) {
        switch (position) {
            case 0://检测僵尸粉

                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }
    }


}
