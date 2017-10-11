package com.example.admin.broadcasthomework;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 10/11/2017.
 */

public class MainReceiver extends BroadcastReceiver {
    List<FourD> fourDList;
    FourD[] fourDArray;
    ListView listView;

    public MainReceiver(ListView listView) {
        this.listView = listView;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        fourDList = new ArrayList<>();
        fourDList = (List<FourD>) intent.getSerializableExtra("fourDList");
        fourDArray = fourDList.toArray(new FourD[fourDList.size()]);
        ListViewAdapter adapter = new ListViewAdapter(context, android.R.layout.simple_list_item_1, fourDArray);
        listView.setAdapter(adapter);
    }
}
