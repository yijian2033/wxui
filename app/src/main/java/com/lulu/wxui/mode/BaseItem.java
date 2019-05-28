package com.lulu.wxui.mode;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * create by zyj
 * on 2019/5/27
 **/
public class BaseItem implements Parcelable {

    private int type;
    private String name;
    private boolean open;
    private String etOne;
    private String etTwo;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public String getEtOne() {
        return etOne;
    }

    public void setEtOne(String etOne) {
        this.etOne = etOne;
    }

    public String getEtTwo() {
        return etTwo;
    }

    public void setEtTwo(String etTwo) {
        this.etTwo = etTwo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.type);
        dest.writeString(this.name);
        dest.writeByte(this.open ? (byte) 1 : (byte) 0);
        dest.writeString(this.etOne);
        dest.writeString(this.etTwo);
    }

    public BaseItem() {
    }

    protected BaseItem(Parcel in) {
        this.type = in.readInt();
        this.name = in.readString();
        this.open = in.readByte() != 0;
        this.etOne = in.readString();
        this.etTwo = in.readString();
    }

    public static final Parcelable.Creator<BaseItem> CREATOR = new Parcelable.Creator<BaseItem>() {
        @Override
        public BaseItem createFromParcel(Parcel source) {
            return new BaseItem(source);
        }

        @Override
        public BaseItem[] newArray(int size) {
            return new BaseItem[size];
        }
    };
}
