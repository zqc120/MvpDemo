package chao.mvpdemo.base;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by Chao on 2017/6/7.
 */

public class BasePrensenter  {

    private CompositeSubscription mCompositeSubscription;
    /**
     * 事件订阅
     * */
    public void addSubscription(Subscription s) {
        if (this.mCompositeSubscription == null) {
            this.mCompositeSubscription = new CompositeSubscription();
        }
        this.mCompositeSubscription.add(s);
    }

    public void unsubcrible() {
        if (this.mCompositeSubscription != null) {
            this.mCompositeSubscription.unsubscribe();
        }
        this.mCompositeSubscription=null;
    }
}