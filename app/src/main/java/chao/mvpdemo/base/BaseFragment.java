package chao.mvpdemo.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import chao.mvpdemo.R;
import chao.mvpdemo.ui.fragment.EmptyFragment;
import chao.mvpdemo.ui.fragment.ErrorFragment;
import chao.mvpdemo.utils.NetWorkUtils;
import chao.mvpdemo.utils.ToastUtils;
import chao.mvpdemo.view.BaseFragmentViewI;
import chao.mvpdemo.widget.WYDialog;

/**
 * Created by Chao on 2017/6/1.
 */
public abstract class BaseFragment extends Fragment implements BaseFragmentViewI {
    private String[] tags = {"home", "wechat", "wy", "gank", "wrong", "empty"};
    private ErrorFragment errorFragment = new ErrorFragment();
    private EmptyFragment emptyFragment = new EmptyFragment();
    private BasePrensenter prensenter;
    public LayoutInflater inflater;


    public void setPresenter(BasePrensenter presenter) {
        this.prensenter = presenter;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        this.inflater = inflater;
        View view = initView();
        initData();
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        showErrorNetWorkInfo(getActivity());
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (!hidden) {
            showErrorNetWorkInfo(getActivity());
        }
    }

    public abstract View initView();

    public void initData() {
        showProcessDialog();
    }

    @Override
    public void showWrongPage(FragmentManager fm) {
        showFragment(fm, errorFragment, "wrong");

    }

    @Override
    public void showEmptyPage(FragmentManager fm) {
        showFragment(fm, emptyFragment, "empty");
    }

    @Override
    public void showSuccessPage(Object bean) {
        showSuccessFragment(bean);
    }

    public abstract void showSuccessFragment(Object bean);

    @Override
    public void showProcessDialog() {
        WYDialog.showProcessDialog(getActivity());

    }

    @Override
    public void hideProcessDialog() {
        WYDialog.hideProgressDialog();
    }

    @Override
    public void showErrorNetWorkInfo(final Activity context) {
        context.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (!NetWorkUtils.isNetworkAvailable(context)) {
                    ToastUtils.show(getActivity(), "your network cannot use ,please checkout!!!");

                }
            }
        });


    }


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

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (prensenter != null) {
            prensenter.unsubcrible();
        }
    }
}