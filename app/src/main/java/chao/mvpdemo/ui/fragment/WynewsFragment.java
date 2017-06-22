package chao.mvpdemo.ui.fragment;

import android.view.View;

import chao.mvpdemo.R;
import chao.mvpdemo.base.BaseFragment;

/**
 * Created by Chao on 2017/6/1.
 */

public class WynewsFragment extends BaseFragment{

    @Override
    public View initView() {
        View v = inflater.inflate(R.layout.fragment_wynews,null,false);
        return v;

    }

    @Override
    public void initData() {
        super.initData();
    }

    @Override
    public void showSuccessFragment(Object bean) {

    }
}
