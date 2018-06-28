package com.mfc.retrofit2demo.http;


import com.mfc.retrofit2demo.model.IpModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2016/9/9 0009.
 */
public interface IpServiceForQuery{
    @Headers({
            "Accept-Encoding: application/json",
            "User-Agent: MoonRetrofit"
    })
    @GET("getIpInfo.php")
    Call<IpModel> getIpMsg(@Query("ip") String ip);
}
