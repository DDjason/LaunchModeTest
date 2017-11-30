package com.zafu.jason.launchmodetest.act;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.zafu.jason.launchmodetest.R;
import com.zafu.jason.launchmodetest.commom.RouterUrl;
import com.zafu.jason.launchmodetest.databinding.CActBinding;
import com.zafu.jason.launchmodetest.viewctrl.ViewCtrl;

/**
 * @author: Yangyd
 * E-mail: yangyd@erongdu.com
 * Date: 2017/11/30$ 14:31$
 * <p/>
 */
@Route(path = RouterUrl.C_ACT)
public class CAct extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CActBinding binding = DataBindingUtil.setContentView(this, R.layout.c_act);
        binding.setViewCtrl(new ViewCtrl());
    }
}
