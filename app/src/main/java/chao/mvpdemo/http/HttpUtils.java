package chao.mvpdemo.http;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Chao on 2017/6/2.
 */

public class HttpUtils {
    private static HttpUtils httpUtils;
    public final WeChatApis weChatApis;


    private HttpUtils(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(WeChatApis.HOST)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        weChatApis = retrofit.create(WeChatApis.class);
    }
    public static HttpUtils getInstance(){
        if (httpUtils==null){
            synchronized (HttpUtils.class){
                if (httpUtils==null){
                    httpUtils = new HttpUtils();
                }
            }
        }
        return httpUtils;
    }
    public WeChatApis getWeChatApis(){
        return weChatApis;
    }

}
