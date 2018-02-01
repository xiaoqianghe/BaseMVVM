package com.xiaoqianghe.basemvvm.basemvvm.ui.activity;

import com.xiaoqianghe.basemvvm.basemvvm.BR;
import com.xiaoqianghe.basemvvm.basemvvm.R;
import com.xiaoqianghe.basemvvm.basemvvm.base.BaseActivity;
import com.xiaoqianghe.basemvvm.basemvvm.databinding.ActivityLoginBinding;
import com.xiaoqianghe.basemvvm.basemvvm.ui.vm.LoginViewModel;

/**
 * Author：Wq
 * Date：2018/1/31 16:44
 * Description：//todo
 */

public class LoginActivity extends BaseActivity<ActivityLoginBinding,LoginViewModel> {



    @Override
    protected LoginViewModel initViewModel() {
        return new LoginViewModel(this);
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public int initContentView() {
        return R.layout.activity_login;
    }
}
