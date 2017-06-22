package chao.mvpdemo.presents;

import chao.mvpdemo.http.WeChatApis;

/**
 * Created by Chao on 2017/6/5.
 */

public interface WeChatPresenterI {
    //get data and notify view to change
    void getData(WeChatApis weChatApis);
}
