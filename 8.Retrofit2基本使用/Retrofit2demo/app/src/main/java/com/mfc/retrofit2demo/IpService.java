package com.mfc.retrofit2demo;

import com.mfc.retrofit2demo.model.IpModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IpService{
    @GET("getIpInfo.php")
    Call<IpModel> getIpMsg(@Query("ip") String ip);
}