package com.xiaoqianghe.basemvvm.basemvvm.base;

/**
 * Author：Wq
 * Date：2018/1/31 10:36
 * Description：//todo
 */

public interface IBaseViewModel {


    /**
     * @// TODO: 2018/1/31
     * View 界面创建的时候的回调
     *
     * */
    void onCreate();


    /***'
     *
     *@// TODO: 2018/1/31
     * View 销毁时候的回调
     */

    void onDestory();




    void registerRxBus();

    void removeRxBus();


}
