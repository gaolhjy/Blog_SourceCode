package com.mfc.retrofit2demo.model;

import java.io.Serializable;
import java.util.List;

/**
 * <pre>
 *     author : 高磊华
 *     e-mail : 984992087@qq.com
 *     time   : 2017/10/10
 *     desc   : 登录失败返回的信息
 * </pre>
 */


public class LoginFailResponBean implements Serializable {

    private String status;
    private int     code;
    private String  msg;
    private List<?> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }
}
