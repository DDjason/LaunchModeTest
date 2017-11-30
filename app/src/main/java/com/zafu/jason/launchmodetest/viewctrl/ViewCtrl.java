package com.zafu.jason.launchmodetest.viewctrl;

import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.zafu.jason.launchmodetest.commom.RouterUrl;

/**
 * @author: Yangyd
 * E-mail: yangyd@erongdu.com
 * Date: 2017/11/30$ 14:56$
 * <p/>
 */
public class ViewCtrl {
    public ViewCtrl() {

    }

    public void onClickA(View view) {
        ARouter.getInstance().build(RouterUrl.A_ACT).navigation();
    }

    public void onClickB(View view) {
        ARouter.getInstance().build(RouterUrl.B_ACT).navigation();
    }

    public void onClickC(View view) {
        ARouter.getInstance().build(RouterUrl.C_ACT).navigation();
    }

    public void onClickD(View view) {
        ARouter.getInstance().build(RouterUrl.D_ACT).navigation();
    }
}
