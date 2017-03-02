package com.myolq.frame.callback;

import com.myolq.frame.ErrorBean;

import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by Administrator on 2017/1/23.
 */

public abstract class HttpCallBack<T> extends BaseCallBack{

    public abstract void onSuccess(T t, Call call, Response response);

    public abstract void onError(Call call, Response response, Exception e);

}
