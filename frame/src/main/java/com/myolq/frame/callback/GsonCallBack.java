package com.myolq.frame.callback;


import java.lang.reflect.Type;

import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by Administrator on 2016/10/20 0020.
 */

public abstract class GsonCallBack<T> extends HttpCallBack<T>{

    private Type type;

    public Type getType() {
        return type;
    }

    public GsonCallBack(Type type) {
        // TODO Auto-generated constructor stub
        this.type=type;
    }

    public abstract void onSuccess(T t, Call call, Response response);

    public abstract void onError(Call call, Response response, Exception e);


}
