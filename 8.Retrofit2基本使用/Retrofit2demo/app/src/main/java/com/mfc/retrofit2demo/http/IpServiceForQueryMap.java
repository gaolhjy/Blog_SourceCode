package com.mfc.retrofit2demo.http;


import com.mfc.retrofit2demo.model.IpModel;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.QueryMap;

/**
 * Created by Administrator on 2016/11/1 0001.
 */

public interface IpServiceForQueryMap {
    @Headers({
            "Accept-Encoding: application/json",
            "User-Agent: MoonRetrofit"
    })
    @GET("getIpInfo.php")
    Call<IpModel> getIpMsg(@QueryMap Map<String, String> options);
}
