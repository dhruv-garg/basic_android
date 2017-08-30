package com.example.lenovo.alarammanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

/**
 * Created by lenovo on 28-Jun-17.
 */

public class Kuchbhi extends BroadcastReceiver{

    MediaPlayer mp;


    @Override
    public void onReceive(Context context, Intent intent) {
        mp = MediaPlayer.create(context,R.raw.play);
        mp.start();
        Toast.makeText(context, "Alarm...", Toast.LENGTH_LONG).show();

    }
}
