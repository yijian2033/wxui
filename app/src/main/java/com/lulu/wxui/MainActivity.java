package com.lulu.wxui;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lulu.wxui.mode.HomeBean;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Task().execute();
    }

    private class Task extends AsyncTask<String, Integer, ArrayList<HomeBean>> {
        @Override
        protected ArrayList<HomeBean> doInBackground(String... strings) {
            ArrayList<HomeBean> homeBeans = new ArrayList<>();
            for (int i = 0; i < 9; i++) {
                homeBeans.add(new HomeBean(R.mipmap.ic_launcher, "名字 " + i));
            }

            return homeBeans;
        }

        @Override
        protected void onPostExecute(ArrayList<HomeBean> homeBeans) {
            super.onPostExecute(homeBeans);
            UiFragmentDialog.show(MainActivity.this, homeBeans);
        }
    }
}
