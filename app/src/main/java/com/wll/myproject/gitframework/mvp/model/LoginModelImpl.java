package com.wll.myproject.gitframework.mvp.model;

import com.wll.myproject.gitframework.mvp.contract.LoginContract;

import java.util.ArrayList;
import java.util.List;

/**
 * You can do well if you want to
 * Create by WLL on 2020/6/24 DATA: 10:28
 */

public class LoginModelImpl implements LoginContract.Model {
    @Override
    public void getData1(WlCallBack wlCallBack) {
        //获取学生的数据后返回。
        wlCallBack.fail();
    }

    @Override
    public void getData2(WlCallBack wlCallBack) {
        //获取老师的数据后返回。

    }

    @Override
    public void getData3(OtherCallBack otherCallBack) {
        //这里查询数据。
        otherCallBack.success( "" );
        otherCallBack.fail();
    }

    @Override
    public void getList(String url, ListCallBack callBack) {
        //
        List<Student> students = new ArrayList<>();
        students.add( new Student( "王朗", "1a2s3d" ) );
        students.add( new Student( "王蓝", "1a2s3d" ) );
        students.add( new Student( "王岚", "1a2s3d" ) );
        students.add( new Student( "王澜", "1a2s3d" ) );
        students.add( new Student( "王兰", "1a2s3d" ) );
        students.add( new Student( "杨淑贤", "13643820365" ) );
       callBack.success( students );
    }


}
