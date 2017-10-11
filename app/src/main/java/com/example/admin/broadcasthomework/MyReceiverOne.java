package com.example.admin.broadcasthomework;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiverOne extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Power Connected", Toast.LENGTH_SHORT).show();
    }
}
