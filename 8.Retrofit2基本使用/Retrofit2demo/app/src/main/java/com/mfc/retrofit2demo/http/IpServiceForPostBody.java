package com.mfc.retrofit2demo.http;


import com.mfc.retrofit2demo.model.LoginFailResponBean;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by Administrator on 2016/11/1 0001.
 */

public interface IpServiceForPostBody {

    @Headers({"Accept:application/vnd.cattlepie.v1+json",
            "Content-Type:application/x-www-form-urlencoded"})
    @POST("http://apidev.cattlepie.com/index.php/api/user/auth/login")
    Call<LoginFailResponBean> createUser(@Body User user);

}
