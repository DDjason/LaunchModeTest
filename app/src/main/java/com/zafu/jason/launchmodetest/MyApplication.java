package com.zafu.jason.launchmodetest;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @author: Yangyd
 * E-mail: yangyd@erongdu.com
 * Date: 2017/11/30$ 14:26$
 * <p/>
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        basicInit();
    }

    private void basicInit() {

        ARouter.openLog();     // 打印日志
        ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)

        ARouter.init(this);
    }
}
