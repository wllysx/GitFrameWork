package com.wll.myproject.gitframework.mvp.model;

/**
 * You can do well if you want to
 * Create by WLL on 2020/6/19 DATA: 13:53
 */

public class Student {
    String name;
    String password;

    public Student(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
