package com.codesniper.codeaop;

import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

public class TraceUtil {
    private final String TAG = "TraceUtil";

    /**
     * 当Activity执行了onCreate时触发
     *
     * @param activity
     */
    public static void onActivityCreate(Activity activity) {
        Toast.makeText(activity
                , activity.getClass().getName() + "call onCreate"
                , Toast.LENGTH_SHORT).show();
    }


    public static void onLoadUrl(){
        Log.e("chenhong","onLoadUrl");
    }


    /**
     * 当Activity执行了onDestroy时触发
     *
     * @param activity
     */
    public static void onActivityPause(Activity activity) {
        Toast.makeText(activity
                , activity.getClass().getName() + "call onDestroy"
                , Toast.LENGTH_SHORT).show();
    }

}
