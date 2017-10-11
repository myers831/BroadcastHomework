package com.example.admin.broadcasthomework;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class MyIntentService extends IntentService {

    List<FourD> fourDList = new ArrayList<>();
    Random rand = new Random();

    public MyIntentService() {
        super("MyIntentService");
    }


    @Override
    public void onCreate() {
        super.onCreate();

        for(int i = 0; i <= 10; i++){
            int  n = rand.nextInt(50) + 1;
            int n2 = rand.nextInt(50) + 1;
            int n3 = rand.nextInt(50) + 1;
            int n4 = rand.nextInt(50) + 1;
            fourDList.add(new FourD(n, n2, n3, n4));
        }
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        Intent recieverIntent = new Intent();
        recieverIntent.setAction(Constants.ACTION.ACTION1);
        recieverIntent.putExtra("fourDList", (Serializable) fourDList);

        sendBroadcast(recieverIntent);
    }

}
