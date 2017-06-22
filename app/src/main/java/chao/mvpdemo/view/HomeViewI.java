package chao.mvpdemo.view;

import java.util.HashMap;

import chao.mvpdemo.ui.adapter.HomeRecAdapter;

/**
 * Created by Chao on 2017/6/7.
 */


public interface HomeViewI extends BaseFragmentViewI {

    void showVIewPager(HashMap map);
    void showList(HomeRecAdapter adapter);
}
