package com.lulu.wxui;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lulu.wxui.dialog.HomeDialogFragment;
import com.lulu.wxui.mode.HomeBean;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String[] mNameArray;
    private int[] mDrawables;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNameArray = new String[]{
                "检测僵尸粉",
                "群发助手",
                "加群好友",
                "加附近的人",
                "跟发朋友圈",
                "朋友圈管理",
                "群管理",
                "万群直播",
                "好友请求",
                "自动回复",
                "标记消息",
                "防撤回",
                "清除会话",
                "收帐管理"
        };

        mDrawables = new int[]{
                R.mipmap.detection,
                R.mipmap.assistant,
                R.mipmap.add,
                R.mipmap.near,
                R.mipmap.follow_friends,
                R.mipmap.management,
                R.mipmap.group_management,
                R.mipmap.live,
                R.mipmap.friend_request,
                R.mipmap.auto_reply,
                R.mipmap.the_tag_information,
                R.mipmap.the_withdrawal,
                R.mipmap.remove,
                R.mipmap.collect_management
        };

        new Task().execute();
    }

    private class Task extends AsyncTask<String, Integer, ArrayList<HomeBean>> {
        @Override
        protected ArrayList<HomeBean> doInBackground(String... strings) {
            ArrayList<HomeBean> homeBeans = new ArrayList<>();
            for (int i = 0; i < mNameArray.length; i++) {
                homeBeans.add(new HomeBean(mDrawables[i], mNameArray[i]));
            }

            return homeBeans;
        }

        @Override
        protected void onPostExecute(ArrayList<HomeBean> homeBeans) {
            super.onPostExecute(homeBeans);
            HomeDialogFragment.show(MainActivity.this, homeBeans);
        }
    }
}
