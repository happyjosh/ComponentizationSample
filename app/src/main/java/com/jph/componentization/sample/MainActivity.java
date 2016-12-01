package com.jph.componentization.sample;

import android.os.Bundle;
import android.view.View;

import com.jph.componentization.common.BaseActivity;
import com.jph.componentization.shopping.ShoppingModule;


public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.main_btn_jump).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShoppingModule.getInstance().openShoppingActivity(v.getContext());
            }
        });
    }
}
