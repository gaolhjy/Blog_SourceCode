package com.glh.serializabledemo;

import java.io.Serializable;

/**
 * <pre>
 *     author : 高磊华
 *     e-mail : 984992087@qq.com
 *     time   : 2017/12/28
 *     desc   : 使用Serializable.直接实现接口即可.操作简单
 * </pre>
 */

public class Person implements Serializable{

    private static final long serialVersionUID = 7382351359868556980L;
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
