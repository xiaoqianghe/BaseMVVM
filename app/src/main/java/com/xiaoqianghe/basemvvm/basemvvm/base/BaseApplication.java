package com.xiaoqianghe.basemvvm.basemvvm.base;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;

import com.xiaoqianghe.basemvvm.basemvvm.utils.Utils;

/**
 * Author：Wq
 * Date：2018/1/31 15:47
 * Description：//todo
 */

public class BaseApplication extends Application {


    private static BaseApplication sInstance;

    @Override
    public void onCreate() {
        super.onCreate();

        sInstance=this;


        Utils.init(this);

        registerActivityLifecycleCallbacks(mCallbacks);






    }



    /**
     * 获得当前app运行的AppContext
     */
    public static BaseApplication getInstance() {
        return sInstance;
    }

    private ActivityLifecycleCallbacks mCallbacks = new ActivityLifecycleCallbacks() {

        @Override
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            AppManager.getAppManager().addActivity(activity);
        }

        @Override
        public void onActivityStarted(Activity activity) {
        }

        @Override
        public void onActivityResumed(Activity activity) {
        }

        @Override
        public void onActivityPaused(Activity activity) {
        }

        @Override
        public void onActivityStopped(Activity activity) {
        }

        @Override
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        }

        @Override
        public void onActivityDestroyed(Activity activity) {
            AppManager.getAppManager().removeActivity(activity);
        }
    };
}
