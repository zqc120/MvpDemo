package chao.mvpdemo.view;

import android.app.Activity;
import android.support.v4.app.FragmentManager;
import android.widget.Toast;

import chao.mvpdemo.utils.NetWorkUtils;

/**
 * Created by Chao on 2017/6/5.
 */

public class BaseFragmentView implements BaseFragmentViewI {
    @Override
    public void showWrongPage(FragmentManager fm) {

    }

    @Override
    public void showEmptyPage(FragmentManager fm) {

    }

    @Override
    public void showSuccessPage(Object bean) {

    }

    @Override
    public void showProcessDialog() {

    }

    @Override
    public void hideProcessDialog() {

    }

    @Override
    public void showErrorNetWorkInfo(final Activity context) {
        context.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (!NetWorkUtils.isNetworkAvailable(context)) {
                    Toast.makeText(context, "your network cannot use ,please checkout!!!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}