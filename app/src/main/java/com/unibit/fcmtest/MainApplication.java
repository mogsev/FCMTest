package com.unibit.fcmtest;

import android.app.Application;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainApplication extends Application {
    private static final String TAG = "MainApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "onCreate");

        // [START subscribe_topics]
        FirebaseMessaging.getInstance().subscribeToTopic("news");
        String token = FirebaseInstanceId.getInstance().getToken();
        Log.i(TAG, "FCM Token: " + token);
        // [END subscribe_topics]
    }
}
