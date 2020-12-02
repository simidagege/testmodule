package com.young.testmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.os.Environment;
import androidx.databinding.DataBindingUtil;

import com.young.testmodule.databinding.ActivityMain2Binding;
import com.young.testmodule.databinding.ActivityMainBinding;
import com.young.testmodule.databinding.ActivityTestDbBinding;
import com.young.testmodule1.testmodule;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "yangyang_MainActivity";
    private PeopleBean peopleBean;
    private ActivityMainBinding activityMainBinding;
    private ActivityMain2Binding am2b;
    private ActivityTestDbBinding atdb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);

        int ret = new testmodule().add(1, 2);
        Log.d(TAG, "ret = " + ret);

        am2b = DataBindingUtil.setContentView(this, R.layout.activity_main_2);
        peopleBean = new PeopleBean("young", 16);
        am2b.setData(peopleBean);
    }
}