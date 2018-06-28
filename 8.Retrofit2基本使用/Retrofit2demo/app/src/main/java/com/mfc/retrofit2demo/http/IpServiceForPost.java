package com.mfc.retrofit2demo.http;


import com.mfc.retrofit2demo.model.IpModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by Administrator on 2016/10/31 0031.
 */

public interface IpServiceForPost {
    @Headers({
            "Accept-Encoding: application/json",
            "User-Agent: MoonRetrofit"
    })
    @FormUrlEncoded
    @POST("getIpInfo.php")
    Call<IpModel> getIpMsg(@Field("ip") String first);
}
