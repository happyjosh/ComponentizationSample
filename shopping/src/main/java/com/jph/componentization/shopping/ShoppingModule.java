package com.jph.componentization.shopping;

import android.content.Context;
import android.content.Intent;

import com.jph.componentization.common.IModule;

/**
 * Created by jph on 2016/11/30.
 */
public class ShoppingModule implements IModule {

    private static ShoppingModule mInstance;

    private ShoppingModule() {
    }

    public static ShoppingModule getInstance() {
        syncInit();
        return mInstance;
    }

    private static void syncInit() {
        if (mInstance == null) {
            mInstance = new ShoppingModule();
        }
    }

    public void openShoppingActivity(Context context) {
        context.startActivity(new Intent(context, ShoppingActivity.class));
    }
}
