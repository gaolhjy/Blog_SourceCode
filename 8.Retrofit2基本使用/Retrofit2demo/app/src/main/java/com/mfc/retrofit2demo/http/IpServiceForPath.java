package com.mfc.retrofit2demo.http;


import com.mfc.retrofit2demo.model.IpModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

/**
 * Created by Administrator on 2016/10/31 0031.
 */

public interface IpServiceForPath {
    @Headers({
            "Accept-Encoding: application/json",
            "User-Agent: MoonRetrofit"
    })
    @GET("{path}/getIpInfo.php?ip=59.108.54.37")
    Call<IpModel> getIpMsg(@Path("path") String path);
}
