package com.glh.asynctaskdemo;

import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String downFileUrl = "https://raw.githubusercontent" +
            ".com/guolindev/eclipse/master/eclipse-inst-win64" +
            ".exe";

    String testUrl = "CCCC";

    private Context      mContext;
    private DownloadTask downloadTask;
    private ProgressBar  mProgressBar;
    private TextView     tv, status;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        mProgressBar = findViewById(R.id.progressbar);
        tv = findViewById(R.id.tv);
        status = findViewById(R.id.status);

        findViewById(R.id.start_download).setOnClickListener(this);
        findViewById(R.id.pause_download).setOnClickListener(this);
        findViewById(R.id.cancel_download).setOnClickListener(this);
    }

    private DownloadListener listener = new DownloadListener() {
        @Override
        public void onProgress(int progress) {
            mProgressBar.setProgress(progress);
            tv.setText(progress + "   %");
            status.setText("当前状态:正在下载");
        }

        @Override
        public void onSuccess() {
            downloadTask = null;
            mProgressBar.setVisibility(View.GONE);
            Toast.makeText(mContext, "下载成功", Toast.LENGTH_SHORT).show();
            status.setText("当前状态:下载完成");
        }

        @Override
        public void onFailed() {
            downloadTask = null;
            mProgressBar.setVisibility(View.GONE);
            Toast.makeText(mContext, "下载失败", Toast.LENGTH_SHORT).show();
            status.setText("当前状态:下载失败");
        }

        @Override
        public void onPaused() {
            downloadTask = null;
            Toast.makeText(mContext, "暂停", Toast.LENGTH_SHORT).show();
            status.setText("当前状态:暂停下载");
        }

        @Override
        public void onCanceled() {
            downloadTask = null;
            tv.setText(0 + "   %");
            status.setText("当前状态:取消下载");
            mProgressBar.setVisibility(View.GONE);
            Toast.makeText(mContext, "取消", Toast.LENGTH_SHORT).show();
            String fileName = downFileUrl.substring(downFileUrl.lastIndexOf("/"));
            String directory =
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
            File file = new File(directory + fileName);
            if (file.exists()) {
                file.delete();
            }
        }
    };

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.start_download:
                if (downloadTask == null) {
                    downloadTask = new DownloadTask(listener);
                    downloadTask.execute(downFileUrl, testUrl);
                }
                break;
            case R.id.pause_download:
                if (downloadTask != null) {
                    downloadTask.pauseDownload();
                }
                break;
            case R.id.cancel_download:
                if (downloadTask != null) {
                    downloadTask.cancelDownload();
                }
                break;
            default:
                break;
        }
    }
}
