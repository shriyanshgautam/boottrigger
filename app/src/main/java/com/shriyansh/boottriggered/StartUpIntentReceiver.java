package com.shriyansh.boottriggered;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by shriyansh on 26/4/16.
 */
public class StartUpIntentReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent serviceIntent = new Intent(context, MyService.class);
        context.startService(serviceIntent);
        Log.i("Autostart", "started");
    }


}
