package com.glh.systeminfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * <pre>
 *     author : 高磊华
 *     e-mail : 984992087@qq.com
 *     time   : 2017/12/23
 *     desc   : Android手机上安装的apk信息 适配器
 * </pre>
 */

public class PMAdapter extends BaseAdapter {

    private List<PMAppInfo> mAppInfoList = null;
    private LayoutInflater  mInflater    = null;

    public PMAdapter(Context context, List<PMAppInfo> appInfoList) {
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mAppInfoList = appInfoList;
    }

    @Override
    public int getCount() {
        return mAppInfoList.size();
    }

    @Override
    public Object getItem(int position) {
        return mAppInfoList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.item_pm, null);
            holder.appIcon = (ImageView) convertView.findViewById(R.id.imageView_icon);
            holder.appLabel = (TextView) convertView.findViewById(R.id.textView_label);
            holder.appPackage = (TextView) convertView.findViewById(R.id.textView_package);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        PMAppInfo appInfo = (PMAppInfo) getItem(position);
        holder.appIcon.setImageDrawable(appInfo.getAppIcon());
        holder.appLabel.setText(appInfo.getAppLabel());
        holder.appPackage.setText(appInfo.getPkgName());
        return convertView;
    }

    class ViewHolder {
        ImageView appIcon;
        TextView  appLabel;
        TextView  appPackage;
    }
}