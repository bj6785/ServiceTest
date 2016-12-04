package com.verifone.kail1.servicetest;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by KaiL1 on 2016/12/4.
 */

public class VerifoneService extends Service {

    private DownloadBinder verifoneBinder = new DownloadBinder();
    class DownloadBinder extends Binder {
        public void startDownload() {
            Log.d("--->VerifoneService", "startDownload executed");
        }

        public int getProgress() {
            Log.d("--->VerifoneService", "getProgress executed");
            return 0;
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return verifoneBinder;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("--->VerifoneService", "onCreate executed");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("--->VerifoneService", "onStartCommand executed");
       return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("--->VerifoneService", "onDestroy executed");
    }
}
