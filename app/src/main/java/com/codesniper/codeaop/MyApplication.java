package com.codesniper.codeaop;

import android.app.Application;

import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.WebView;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        QbSdk.initX5Environment(this, new QbSdk.PreInitCallback() {
            @Override
            public void onCoreInitFinished() {

            }

            @Override
            public void onViewInitFinished(boolean b) {

            }
        });

    }
}
