package com.mfc.retrofit2demo.http;

/**
 * <pre>
 *     author : 高磊华
 *     e-mail : 984992087@qq.com
 *     time   : 2018/06/28
 *     desc   :
 *     version: 1.0
 * </pre>
 */

public class User {

    private String member_mobile;
    private String member_passwd;

    public User(String member_mobile, String member_passwd) {
        this.member_mobile = member_mobile;
        this.member_passwd = member_passwd;
    }

    public String getMember_mobile() {
        return member_mobile;
    }

    public void setMember_mobile(String member_mobile) {
        this.member_mobile = member_mobile;
    }

    public String getMember_passwd() {
        return member_passwd;
    }

    public void setMember_passwd(String member_passwd) {
        this.member_passwd = member_passwd;
    }
}
