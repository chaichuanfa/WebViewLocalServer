package com.felix.webviewlocalserver.sample;

import com.tencent.smtt.sdk.QbSdk;

import android.app.Application;

/**
 * Created by chaichuanfa on 2018/2/2.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        try {
            QbSdk.initX5Environment(this, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
