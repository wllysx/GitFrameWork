package com.wll.myproject.gitframework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class RedRainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_red_rain );
        Toast.makeText( this, "测试", Toast.LENGTH_SHORT ).show();
    }
}
