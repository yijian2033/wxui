package com.lulu.wxui.mode;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * create by zyj
 * on 2019/5/24
 **/
public class HomeBean implements Parcelable {



    private int resourceId;
    private String name;

    public HomeBean(int resourceId, String name) {
        this.resourceId = resourceId;
        this.name = name;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.resourceId);
        dest.writeString(this.name);
    }

    protected HomeBean(Parcel in) {
        this.resourceId = in.readInt();
        this.name = in.readString();
    }

    public static final Parcelable.Creator<HomeBean> CREATOR = new Parcelable.Creator<HomeBean>() {
        @Override
        public HomeBean createFromParcel(Parcel source) {
            return new HomeBean(source);
        }

        @Override
        public HomeBean[] newArray(int size) {
            return new HomeBean[size];
        }
    };
}
