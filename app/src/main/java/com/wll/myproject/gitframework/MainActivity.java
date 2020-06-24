package com.wll.myproject.gitframework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.wll.myproject.gitframework.mvp.contract.MainView;
import com.wll.myproject.gitframework.mvp.model.Student;
import com.wll.myproject.gitframework.mvp.presenter.LoginPresenterImpl;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {
    //创建presenter对象。
    private LoginPresenterImpl presenter;
    ListView listView;
    List<Student> students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        Log.i( "wll11", "1" );
        Log.i( "wll11", "1" );
        presenter = new LoginPresenterImpl( this );
        presenter.getList( "" );
        listView = findViewById( R.id.m_list );
        listView.setAdapter( new MyAdapter( students ) );
    }

    @Override
    public void showData1(List list) {

    }

    @Override
    public void showData2(List list) {

    }

    @Override
    public void showData3(String string) {

    }

    @Override
    public void showList(List list) {
        if (list.get( 0 ) instanceof Student) {
            students = list;
        }

    }
}
