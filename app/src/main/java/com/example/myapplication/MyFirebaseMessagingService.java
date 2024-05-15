package com.example.myapplication;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import android.content.Intent;

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        // Check if the message contains data payload.
        if (remoteMessage.getData().size() > 0) {
            // Handle data payload of the message.
            // You can extract any necessary data from remoteMessage.getData().
            // Start the FloatingViewService when a message is received.
            Intent intent = new Intent(this, FloatingViewService.class);
            startService(intent);
        }
    }
}

