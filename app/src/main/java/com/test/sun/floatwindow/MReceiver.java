package com.test.sun.floatwindow;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by ZS27 on 2016/12/7.
 */

public class MReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("info", "MReceiver:onReceive----------------------");
        Intent intent1 = new Intent();
        intent1.setClassName(context, "com.test.sun.floatwindow.MFloat");
        context.startService(intent1);
    }
}
