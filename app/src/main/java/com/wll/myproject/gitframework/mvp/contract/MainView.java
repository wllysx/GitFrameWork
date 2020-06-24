package com.wll.myproject.gitframework.mvp.contract;

import com.wll.myproject.gitframework.mvp.model.Student;

import java.util.List;

/**
 * You can do well if you want to
 * Create by WLL on 2020/6/24 DATA: 11:14
 */

public interface MainView<T> extends LoginContract.View {

    public void showData1(List<Student> students);
    public void showData2(List<Student> students);
    public void showData3(String  string);

    public void showList(List<T> list);
}
