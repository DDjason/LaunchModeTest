package com.zafu.jason.launchmodetest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;
import com.zafu.jason.launchmodetest.act.BaseActivity;
import com.zafu.jason.launchmodetest.commom.RouterUrl;

public class MainActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.goa);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build(RouterUrl.A_ACT).navigation();
            }
        });
    }
}
