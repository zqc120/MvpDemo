package chao.mvpdemo.view;

import android.app.Activity;
import android.support.v4.app.FragmentManager;

/**
 * Created by Chao on 2017/6/5.
 */

public interface BaseFragmentViewI {
    void showWrongPage(FragmentManager fm);
    void showEmptyPage(FragmentManager fm);
    void showSuccessPage(Object obj);
    void showProcessDialog();
    void hideProcessDialog();
    void showErrorNetWorkInfo(Activity context);
}
