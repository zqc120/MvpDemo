package chao.mvpdemo.view;

import android.app.Activity;

/**
 * Created by Chao on 2017/6/7.
 */


public interface BaseActivityViewI {
    void showWrongPage();
    void showEmptyPage();
    void showSuccessPage(Object... obj);
    void showProcessDialog();
    void hideProcessDialog();
    void showErrorNetWorkInfo(Activity context);
}
