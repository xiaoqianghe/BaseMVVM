package com.xiaoqianghe.basemvvm.basemvvm.base;

import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.trello.rxlifecycle.components.RxFragment;

/**
 * Author：Wq
 * Date：2018/1/31 14:30
 * Description：//todo
 */

public abstract class BaseFragment<V extends ViewDataBinding,VM extends IBaseViewModel> extends RxFragment implements  IBaseActivity {

    protected V bingding;
    protected VM viewModel;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initParam();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initData();

        initViewObservable();

        viewModel.onCreate();


    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        viewModel.removeRxBus();
        viewModel.onDestory();

        viewModel=null;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
