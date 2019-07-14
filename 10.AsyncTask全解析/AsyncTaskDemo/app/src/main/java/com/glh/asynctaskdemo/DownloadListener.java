package com.glh.asynctaskdemo;

/**
 * <pre>
 *     author : 高磊华
 *     e-mail : 984992087@qq.com
 *     company: 银江集团
 *     time   : 2019/07/13
 *     desc   :  下载的回调监听
 *
 * </pre>
 */

public interface DownloadListener {

    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPaused();

    void onCanceled();

}
