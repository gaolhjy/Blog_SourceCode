package com.mfc.retrofit2demo.http;


import com.mfc.retrofit2demo.model.IpModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface IpService {
    @Headers({
            "Accept-Encoding: application/json",
            "User-Agent: MoonRetrofit"
    })
    @GET("getIpInfo.php?ip=59.108.54.37")
    Call<IpModel> getIpMsg();
}
