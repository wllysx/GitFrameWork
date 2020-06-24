package com.wll.myproject.gitframework.mvp.contract;

import com.wll.myproject.gitframework.mvp.model.Student;

import java.util.List;

/**
 * You can do well if you want to
 * Create by WLL on 2020/6/24 DATA: 10:28
 */

public interface LoginContract {
    interface Model {
        //获得学生数据。
        public void getData1(WlCallBack wlCallBack);

        //获得老师数据。
        public void getData2(WlCallBack wlCallBack);

        //获取其他数据。
        public void getData3(OtherCallBack otherCallBack);

        public void getList(String url,ListCallBack callBack);
        interface  ListCallBack<T> {
            void success(List<T> lists);

            void fail();
        }
        interface OtherCallBack{
            void success(String name);
            void fail();
        }

        interface WlCallBack{
            void success(List<Student> students);
            void fail();
        }
    }

    interface View {

    }

    interface Presenter {
        //用来访问数据。
        public void getUrl1(String name);

        public void getUrl2(String name2);

        public void getString(String url);

        public void getList(String url);
    }
}
