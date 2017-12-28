package com.glh.serializabledemo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * <pre>
 *     author : 高磊华
 *     e-mail : 984992087@qq.com
 *     time   : 2017/12/28
 *     desc   : 使用Parcelable.比较复杂.一步一步手写出来
 *               也直接直接使用as的插件.马上就生成了
 * </pre>
 */

public class Pen implements Parcelable{

    private String color;
    private int size;
    
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.color);
        dest.writeInt(this.size);
    }

    public Pen() {
    }

    protected Pen(Parcel in) {
        this.color = in.readString();
        this.size = in.readInt();
    }

    public static final Creator<Pen> CREATOR = new Creator<Pen>() {
        @Override
        public Pen createFromParcel(Parcel source) {
            return new Pen(source);
        }

        @Override
        public Pen[] newArray(int size) {
            return new Pen[size];
        }
    };

    // ======分割线，写写get和set
    //个人自己添加
    public Pen(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
