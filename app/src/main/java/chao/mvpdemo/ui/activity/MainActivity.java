package chao.mvpdemo.ui.activity;


import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.MotionEvent;
import android.widget.RadioGroup;

import java.util.ArrayList;

import chao.mvpdemo.R;
import chao.mvpdemo.base.BaseActivity;
import chao.mvpdemo.ui.fragment.GankFragment;
import chao.mvpdemo.ui.fragment.HomeFragment;
import chao.mvpdemo.ui.fragment.WeChatFragment;
import chao.mvpdemo.ui.fragment.WynewsFragment;
import chao.mvpdemo.view.SwitchMainViewI;

public class MainActivity extends BaseActivity implements SwitchMainViewI {
    private RadioGroup rg;
    private FragmentManager fm;
    private HomeFragment home;
    private WeChatFragment wechat;
    private WynewsFragment wy;
    private GankFragment gank;
    private String[] tags = {"home", "wechat", "wy", "gank"};

    @Override
    public void initView() {
        setContentView(R.layout.activity_main);
        rg = (RadioGroup) findViewById(R.id.rg);
        swichPages();
    }

    @Override
    public void initData() {
    }

    @Override
    public void swichPages() {
        fm = getSupportFragmentManager();
        home = new HomeFragment();
        wechat = new WeChatFragment();
        wy = new WynewsFragment();
        gank = new GankFragment();
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId) {
                    case R.id.home:
                        showFragment(fm, home, "home");
                        break;
                    case R.id.wechat:
                        showFragment(fm, wechat, "wechat");
                        break;
                    case R.id.wy:
                        showFragment(fm, wy, "wy");
                        break;
                    case R.id.gank:
                        showFragment(fm, gank, "gank");
                        break;
                }
            }
        });
    }

    @Override
    public void showFragment(FragmentManager fm, Fragment fragment, String str) {
        FragmentTransaction ft;
        ft = fm.beginTransaction();
        for (String tag : tags) {
            if (!tag.equals(str)) {
                Fragment fragmentTemp = fm.findFragmentByTag(tag);
                if (fragmentTemp != null) {
                    ft.hide(fragmentTemp);
                }
            }
        }
        if (fm.findFragmentByTag(str) == null) {
            ft.add(R.id.f1, fragment, str);
        }
        ft.show(fragment);
        ft.commit();
    }

    private ArrayList<MyOnTouchListener> onTouchListeners = new ArrayList<MyOnTouchListener>(
            10);


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        for (MyOnTouchListener listener : onTouchListeners) {
            listener.onTouch(ev);
        }
        return super.dispatchTouchEvent(ev);
    }

    public void registerMyOnTouchListener(MyOnTouchListener myOnTouchListener) {
        onTouchListeners.add(myOnTouchListener);
    }

    public void unregisterMyOnTouchListener(MyOnTouchListener myOnTouchListener) {
        onTouchListeners.remove(myOnTouchListener);
    }


    @Override
    public void showSuccessPage(Object... obj) {

    }

    public interface MyOnTouchListener {
        public boolean onTouch(MotionEvent ev);
    }

}
