package chao.mvpdemo.view;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by Chao on 2017/6/5.
 */
public interface SwitchMainViewI {

    void swichPages();
    void showFragment(FragmentManager fm, Fragment fragment, String str);
}
