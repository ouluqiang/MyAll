package com.myolq.mvp;

import android.app.Application;

import com.myolq.frame.loader.OkgoLoader;

/**
 * Created by Administrator on 2017/6/19.
 */

public class BaseApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        OkgoLoader.getInstance().init(this);
    }
}
