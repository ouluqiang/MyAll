package com.olq.mytotal.base;

import android.app.Application;

import com.myolq.frame.loader.OkgoLoader;

/**
 * Created by Administrator on 2017/1/3.
 */

public class BaseApplication extends Application{

    private OkgoLoader mOkgoUtils;

    @Override
    public void onCreate() {
        super.onCreate();
        mOkgoUtils = OkgoLoader.getInstance();
        mOkgoUtils.init(this);
    }
}
