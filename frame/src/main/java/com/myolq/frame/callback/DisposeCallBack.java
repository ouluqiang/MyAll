package com.myolq.frame.callback;

import android.graphics.Bitmap;

import com.myolq.frame.utils.GsonUtils;

import java.io.File;

import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by Administrator on 2017/1/23.
 */

public class DisposeCallBack {

    public <T> void onSuccess(HttpCallBack<T> callback, String result, Call call, Response response){
        if (callback!=null){
            if (callback instanceof GsonCallBack){
                GsonCallBack gsonCallBack=((GsonCallBack) callback);
                gsonCallBack.onSuccess(GsonUtils.getBeanFromJson(result,gsonCallBack.getType()),call,response);
            }else if(callback instanceof StringCallBack){
                    ((StringCallBack) callback).onSuccess(result,call,response);
            }
        }
    }
    public <T> void onSuccess(HttpCallBack<T> callback, Bitmap result, Call call, Response response){
        if (callback!=null){
            if (callback instanceof BitmapCallBack){
                ((BitmapCallBack) callback).onSuccess(result,call,response);
            }
        }
    }
    public <T> void onSuccess(HttpCallBack<T> callback, File result, Call call, Response response){
        if (callback!=null){
            if (callback instanceof FileCallBack){
                ((FileCallBack) callback).onSuccess(result,call,response);
            }
        }
    }

    public <T> void onError(HttpCallBack<T> callback, Call call, Response response, Exception e){
        if(callback!=null)
        {
//            ErrorBean baseBean= null;
//            try {
//                baseBean = GsonUtils.getBeanFromJson(response.body().string(),ErrorBean.class);
//            } catch (IOException e1) {
//                e1.printStackTrace();
//            }
            callback.onError(call,response,e);
        }

    }


}
