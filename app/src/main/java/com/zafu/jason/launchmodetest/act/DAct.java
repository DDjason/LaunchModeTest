package com.zafu.jason.launchmodetest.act;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.zafu.jason.launchmodetest.R;
import com.zafu.jason.launchmodetest.commom.RouterUrl;
import com.zafu.jason.launchmodetest.databinding.DActBinding;
import com.zafu.jason.launchmodetest.viewctrl.ViewCtrl;

/**
 * @author: Yangyd
 * E-mail: yangyd@erongdu.com
 * Date: 2017/11/30$ 14:31$
 * <p/>
 */
@Route(path = RouterUrl.D_ACT)
public class DAct extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DActBinding binding = DataBindingUtil.setContentView(this, R.layout.d_act);
        binding.setViewCtrl(new ViewCtrl());
    }
}
