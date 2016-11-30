package com.jph.componentization.shopping;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.jph.componentization.common.BaseActivity;

/**
 * Created by jph on 2016/11/29.
 */
public class ShoppingActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
    }
}
