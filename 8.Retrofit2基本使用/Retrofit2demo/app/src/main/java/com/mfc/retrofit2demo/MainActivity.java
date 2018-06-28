package com.mfc.retrofit2demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.mfc.retrofit2demo.http.IpService;
import com.mfc.retrofit2demo.http.IpServiceForPath;
import com.mfc.retrofit2demo.http.IpServiceForPost;
import com.mfc.retrofit2demo.http.IpServiceForPostBody;
import com.mfc.retrofit2demo.http.IpServiceForQuery;
import com.mfc.retrofit2demo.http.User;
import com.mfc.retrofit2demo.model.IpModel;
import com.mfc.retrofit2demo.model.LoginFailResponBean;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);
        findViewById(R.id.btn4).setOnClickListener(this);
        findViewById(R.id.btn5).setOnClickListener(this);
    }


    //网站的链接  http://ip.taobao.com/service/getIpInfo.php?ip=59.108.54.37

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                getIpInformationForQuery("59.108.54.37");
                break;
            case R.id.btn2:
                getIpInformationForPath("service");
                break;
            case R.id.btn3:
                getIpInformation();
                break;
            case R.id.btn4:
                postIpInformation("59.108.54.37");
                break;
            case R.id.btn5:
                postIpInformationForBody("59.108.54.37");
                break;
        }
    }

    /**
     * 普通GET请求
     */
    private void getIpInformation() {

        String url = "http://ip.taobao.com/service/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        IpService ipService = retrofit.create(IpService.class);
        Call<IpModel> call = ipService.getIpMsg();
        call.enqueue(new Callback<IpModel>() {
            @Override
            public void onResponse(Call<IpModel> call, Response<IpModel> response) {
                String country = response.body().getData().getCountry();
                Log.i("gaoleihua", "country" + country);
                Toast.makeText(MainActivity.this, country, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<IpModel> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * @param path
     * @Path方式GET请求
     */
    private void getIpInformationForPath(String path) {
        String url = "http://ip.taobao.com/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        IpServiceForPath ipService = retrofit.create(IpServiceForPath.class);
        Call<IpModel> call = ipService.getIpMsg(path);
        call.enqueue(new Callback<IpModel>() {
            @Override
            public void onResponse(Call<IpModel> call, Response<IpModel> response) {
                String country = response.body().getData().getCountry();
                Log.i("gaoleihua", "country" + country);
                Toast.makeText(MainActivity.this, country, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<IpModel> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    /**
     * @param ip
     * @Query方式GET请求
     */
    private void getIpInformationForQuery(String ip) {
        String url = "http://ip.taobao.com/service/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        IpServiceForQuery ipService = retrofit.create(IpServiceForQuery.class);
        Call<IpModel> call = ipService.getIpMsg(ip);
        call.enqueue(new Callback<IpModel>() {
            @Override
            public void onResponse(Call<IpModel> call, Response<IpModel> response) {
                String country = response.body().getData().getCountry();
                Log.i("gaoleihua", "country" + country);
                Toast.makeText(MainActivity.this, country, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<IpModel> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * 传输数据类型为键值对的POST请求
     *
     * @param ip
     */
    private void postIpInformation(String ip) {
        String url = "http://ip.taobao.com/service/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        IpServiceForPost ipService = retrofit.create(IpServiceForPost.class);
        Call<IpModel> call = ipService.getIpMsg(ip);
        call.enqueue(new Callback<IpModel>() {
            @Override
            public void onResponse(Call<IpModel> call, Response<IpModel> response) {
                String country = response.body().getData().getCountry();
                Log.i("gaoleihua", "country" + country);
                Toast.makeText(MainActivity.this, country, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<IpModel> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * 传输数据类型Json字符串的POST请求
     *
     * @param ip
     */
    private void postIpInformationForBody(String ip) {

        String url = "http://ip.taobao.com/service/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        IpServiceForPostBody ipService = retrofit.create(IpServiceForPostBody.class);
        Call<LoginFailResponBean> call = ipService.createUser(new User("13871599512",
                "w123456"));
        call.enqueue(new Callback<LoginFailResponBean>() {
            @Override
            public void onResponse(Call<LoginFailResponBean> call,
                                   Response<LoginFailResponBean> response) {

                Toast.makeText(MainActivity.this, response.body().getMsg(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<LoginFailResponBean> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
