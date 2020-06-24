package com.wll.myproject.gitframework.mvp.presenter;

import com.wll.myproject.gitframework.mvp.contract.LoginContract;
import com.wll.myproject.gitframework.mvp.contract.MainView;
import com.wll.myproject.gitframework.mvp.model.LoginModelImpl;
import com.wll.myproject.gitframework.mvp.model.Student;

import java.util.List;

/**
 * You can do well if you want to
 * Create by WLL on 2020/6/24 DATA: 10:28
 */

public class LoginPresenterImpl implements LoginContract.Presenter {
    private LoginContract.Model model;
    private MainView view1;

    public LoginPresenterImpl(MainView view) {
        this.view1 = view;
        model = new LoginModelImpl();
    }

    @Override
    public void getUrl1(String name) {
        //通过实例化对象来调用此方法，获得数据。也可以直接实现这个回调接口类。直接重写方法也能。
        model.getData1( new LoginContract.Model.WlCallBack() {
            @Override
            public void success(List<Student> students) {
                //这里回调的数据用view接口中的方法来获得。
                view1.showData1( students );
            }

            @Override
            public void fail() {

            }
        } );

    }

    @Override
    public void getUrl2(String name2) {
        model.getData2( new LoginContract.Model.WlCallBack() {
            @Override
            public void success(List<Student> students) {
                view1.showData2( students );
            }

            @Override
            public void fail() {

            }
        } );
    }

    @Override
    public void getString(String url) {
        model.getData3( new LoginContract.Model.OtherCallBack() {
            @Override
            public void success(String name) {
                view1.showData3( name);
            }

            @Override
            public void fail() {

            }
        } );
    }

    @Override
    public void getList(String url) {
        model.getList( url, new LoginContract.Model.ListCallBack() {
            @Override
            public void success(List lists) {
                view1.showList( lists );
            }

            @Override
            public void fail() {

            }
        } );
    }
}
