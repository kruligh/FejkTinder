package com.example.kruligh.fejktinder;

import android.app.IntentService;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.widget.Toast;

import java.util.Date;

import static java.lang.Math.toIntExact;

public class NotificationService extends IntentService {

    String channelName = "asd123";
    String channelId = "channel-id-tinder";
    Content content = new Content();
    int delay = 0 * 1000;
    int endTime = 4 * 60;
    int initSleep = 0 * 1000;

    private MediaPlayer audioPlayer = null;

    public NotificationService() {
        super("sfsadfasdhuj");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "service starting", Toast.LENGTH_SHORT).show();

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {

            CharSequence name = channelName;
            String description = "Channel description";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = null;
            channel = new NotificationChannel(channelId, name, importance);
            channel.setDescription(description);
            // Register the channel with the system; you can't change the importance
            // or other notification behaviors after this

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }

        return super.onStartCommand(intent, flags, startId);
    }

    private void initAudioPlayer() {
        audioPlayer = MediaPlayer.create(this, R.raw.ballada_o_bialych_paznokciach_mixdown);
    }

    @Override
    protected void onHandleIntent(Intent workIntent) {
        try {
            Thread.sleep(initSleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        long startTime = new Date().getTime();
        this.initAudioPlayer();
        this.audioPlayer.seekTo(delay);
        this.audioPlayer.start();

        for (long nowSec = 0; nowSec < endTime;) {
            long nowMili = delay + new Date().getTime() - startTime;
            nowSec = nowMili / 1000;

            try {
                System.out.println("Now " + nowMili + " " + nowSec);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            handleSecond(nowSec);
        }
        this.audioPlayer.stop();

    }

    private void handleSecond(long nowSec) {
       showTextNotification(toIntExact(nowSec), content.getLyrics().get("" + nowSec));
       showImageNotification(toIntExact(nowSec), content.getImages().get("" + nowSec));
    }

    private void showTextNotification(int nowSec, String message) {
        if(message == null) {
            return;
        }
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this, channelId)
                .setSmallIcon(R.drawable.ic_stat_msgszarypustywsrodku, 0)
//                .setLargeIcon(BitmapFactory.decodeResource(this.getResources(), R.drawable.mes2))
                .setContentTitle("Dominik Krulig Bugz")
                .setStyle(new NotificationCompat.BigTextStyle())
                .setColorized(true)
                .setColor(Color.RED)
                .setContentText(message)
                .setPriority(NotificationCompat.PRIORITY_MAX)
                .setGroup(message)
                .setAutoCancel(true)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE);

        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);

        notificationManager.notify(nowSec, mBuilder.build());
        if (nowSec  > 50) {
            notificationManager.cancel(nowSec - 50);
        }
    }

    private void showImageNotification(int nowSec, ImageNotification message) {
        if(message == null) {
            return;
        }
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this, channelId)
                .setSmallIcon(R.drawable.ic_stat_msgszarypustywsrodku, 0)
                .setContentTitle(message.getMsg())
                .setStyle(new NotificationCompat.BigPictureStyle()
                        .bigPicture(BitmapFactory.decodeResource(this.getResources(), message.getImage()))
                        .bigLargeIcon(null))
//                .setContentText(message.getMsg())
                .setPriority(NotificationCompat.PRIORITY_MAX)
                .setGroup(message.getMsg())
                .setAutoCancel(true)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE);

        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);

        notificationManager.notify(nowSec, mBuilder.build());
    }
}