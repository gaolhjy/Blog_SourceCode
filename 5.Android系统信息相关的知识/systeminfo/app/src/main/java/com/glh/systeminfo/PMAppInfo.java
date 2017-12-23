package com.glh.systeminfo;

import android.graphics.drawable.Drawable;

/**
 * <pre>
 *     author : 高磊华
 *     e-mail : 984992087@qq.com
 *     time   : 2017/12/23
 *     desc   : Android手机上安装的apk信息 数据模型
 * </pre>
 */


public class PMAppInfo {

    private String   appLabel;      //app的应用名
    private Drawable appIcon;        //app的图标
    private String   pkgName;       //app的包名

    public PMAppInfo() {
    }

    public String getAppLabel() {
        return appLabel;
    }

    public void setAppLabel(String appName) {
        this.appLabel = appName;
    }

    public Drawable getAppIcon() {
        return appIcon;
    }

    public void setAppIcon(Drawable appIcon) {
        this.appIcon = appIcon;
    }

    public String getPkgName() {
        return pkgName;
    }

    public void setPkgName(String pkgName) {
        this.pkgName = pkgName;
    }
}
