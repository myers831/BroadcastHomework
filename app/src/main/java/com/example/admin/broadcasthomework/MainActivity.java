package com.example.admin.broadcasthomework;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity{

    MainReceiver mainReceiver;
    ListView listView;
    ImageView imageView;
    int imageLayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.lvList);
        mainReceiver = new MainReceiver(listView);
        imageView = (ImageView) findViewById(R.id.ivImage);
        imageView.setImageResource(R.drawable.level_list_drawable);

        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Constants.ACTION.ACTION1);

        registerReceiver(mainReceiver, intentFilter);

    }

    public void ImageChange() {
        if(imageLayer < 2) {
            imageLayer += 1;
            imageView.setImageLevel(imageLayer);
        } else {
            imageLayer = 0;
            imageView.setImageLevel(imageLayer);
        }
    }

    public void update(View view) {

        ImageChange();

        Intent intent = new Intent(this, MyIntentService.class);
        startService(intent);
    }

}
