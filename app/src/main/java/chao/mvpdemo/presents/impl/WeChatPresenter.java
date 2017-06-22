package chao.mvpdemo.presents.impl;

import android.content.Context;

import java.util.ArrayList;

import chao.mvpdemo.base.BasePrensenter;
import chao.mvpdemo.bean.WeChatNewsBean;
import chao.mvpdemo.http.WeChatApis;
import chao.mvpdemo.presents.WeChatPresenterI;
import chao.mvpdemo.ui.fragment.WeChatFragment;
import chao.mvpdemo.view.BaseFragmentViewI;
import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by Chao on 2017/6/5.
 */
public class WeChatPresenter extends BasePrensenter implements WeChatPresenterI{
    private int pageId=1;
    private static final String TAG = "WeChatPresenter";
    private BaseFragmentViewI v;
    private Context mContext;
    private ArrayList<WeChatNewsBean.NewslistBean> lists=new ArrayList<>();
    @Override
    public void getData(WeChatApis weChatApis) {
        Observable<WeChatNewsBean> weChatNews = weChatApis.getWeChatNews(WeChatApis.MYKEY, pageId+"", "10");
        Subscription subscribe = weChatNews
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<WeChatNewsBean>() {
                    @Override
                    public void call(WeChatNewsBean weChatNewsBean) {
                        lists.addAll(0,weChatNewsBean.getNewslist());
                        v.showSuccessPage(lists);
                        v.hideProcessDialog();
                        WeChatFragment vv = (WeChatFragment) v;
                        vv.wechatSrl.setRefreshing(false);
                    }
                });
        addSubscription(subscribe);

    }

    public void attachView(BaseFragmentViewI v,Context context){
        this.v=v;
        this.mContext=context;
    }

    public  void setPageId(int pageid){
        this.pageId=pageid;
    }


}
