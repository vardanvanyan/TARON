package com.example.vardan.week10lesson2broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootReciever extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED")){
            context.startService(new Intent(context,MyService.class));
        }
    }
}
