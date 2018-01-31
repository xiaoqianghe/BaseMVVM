package com.xiaoqianghe.basemvvm.basemvvm.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.trello.rxlifecycle.components.support.RxAppCompatActivity;


/**
 * Author：Wq
 * Date：2018/1/31 10:50
 * Description：//todo
 */

public abstract class  BaseActivity<V extends ViewDataBinding,VM extends IBaseViewModel> extends RxAppCompatActivity implements  IBaseActivity{

    protected  V binding;
    protected  VM viewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initViewDataBinding();

        initData();


        initViewObservable();
    }

    private void initViewDataBinding() {

        binding= DataBindingUtil.setContentView(this,initContentView());

        binding.setVariable(initVariableId(), viewModel = initViewModel());

    }

    protected abstract VM initViewModel();

    public abstract int initVariableId();

    public abstract int initContentView();

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    @Override
    public void initParam() {

    }

    @Override
    public void initData() {

    }

    @Override
    public void initViewObservable() {

    }
}
