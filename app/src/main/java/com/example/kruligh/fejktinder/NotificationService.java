package com.example.kruligh.fejktinder;

import android.app.IntentService;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Handler;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.widget.Toast;

import java.util.Random;

import static java.lang.Math.toIntExact;

public class NotificationService extends IntentService {

    Random rand = new Random(System.currentTimeMillis());

    public NotificationService() {
        super("sfsadfasdhuj");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "service starting", Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    protected void onHandleIntent(Intent workIntent) {
        for (int i = 0; i < 1 * 60; i++) {
            try {
                int sleepTime = getRandom(10, 21) * 100;
                System.out.println(sleepTime);
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            showNotification(i);
//            (new Handler()).postDelayed(this::showNotification, i * 1000);
        }
    }


    private void showNotification(int i) {
        long messageId = i;
        System.out.println("dupa " + messageId);
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this, "asd102")
                .setSmallIcon(R.drawable.rind)
//                .setLargeIcon(BitmapFactory.decodeResource(this.getResources(), R.drawable.tinder_logo))
                .setContentTitle("Tinder")
                .setColor(Color.RED)
                .setContentText(getContent(i))
                .setPriority(NotificationCompat.PRIORITY_MAX)
                .setGroup(messageId + "")
                .setAutoCancel(true)
                .setCategory(getCategory(i));

        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);

        notificationManager.notify(toIntExact(messageId), mBuilder.build());
        if (i >= 50) {
            notificationManager.cancel(i - 50);
        }
    }

    private String getCategory(int i) {
        switch (i % 10) {
            case 0:
                return NotificationCompat.CATEGORY_ALARM;
            case 1:
                return NotificationCompat.CATEGORY_CALL;
            case 2:
                return NotificationCompat.CATEGORY_EMAIL;
            case 3:
                return NotificationCompat.CATEGORY_ERROR;
            case 4:
                return NotificationCompat.CATEGORY_EVENT;
            case 5:
                return NotificationCompat.CATEGORY_MESSAGE;
            case 6:
                return NotificationCompat.CATEGORY_PROGRESS;
            case 7:
                return NotificationCompat.CATEGORY_SOCIAL;
            case 8:
                return NotificationCompat.CATEGORY_STATUS;
            case 9:
                return NotificationCompat.CATEGORY_REMINDER;
            default:
                return NotificationCompat.CATEGORY_STATUS;
        }
    }

    private String getContent(int i) {
        String name = getName(i);
        String[] proposals = {
                "Użytkownik " + name + " wysłał Ci nową wiadomość.", "Użytkownik " + name + " wysłał Ci nową wiadomość.",
                "Użytkownik " + name + " wysłał Ci nową wiadomość.", //3
                name + " wysłał(a) Ci Super Like!",
                "Masz nową parę!", "Masz nową parę!",
                "Masz nową parę!", "Masz nową parę!",
                "Masz nową parę!", "Masz nową parę!", // 7
        };

        return proposals[getRandom(0, 9)];
    }

    private String getName(int i) {
        if (i == 20) {
            return "Twoja stara";
        }
        String[] names = {
                "Basia",
                "Asia",
                "Gabrysia",
//                "Twoja stara",
                "Camila",
                "Roksi",
                "Kasia",
                "Katarzyna",
                "Julia",
                "Zuzanna",
                "Zofia",
                "Lena",
                "Maja",
                "Hanna",
                "Amelia",
                "Alicja",
                "Maria",
                "Aleksandra",
                "Oliwia",
                "Natalia",
                "Wiktoria",
                "Emilia",
                "Antonina",
                "Laura",
                "Pola",
                "Iga",
                "Anna",
                "Liliana",
                "Zuzanna",
                "Lena",
                "Julia",
                "Maja",
                "Zofia",
                "Alicja",
                "Nati",
                "Nikola",
                "Anna",
                "Antonina",
                "Nadia",
                "Gabriela",
                "Julia",
                "Zuzanna",
                "Zofia",
                "Lena",
                "Maja",
                "Hanna",
                "Amelia",
                "Alicja",
                "Maria",
                "Aleksandra",
                "Oliwia",
                "Natalia",
                "Wiktoria",
                "Wiki",
                "Emilia",
                "Antonina",
                "Laura",
                "Pola",
                "Iga",
                "Anna",
                "Liliana",
                "Nadia",
                "Marcelina",
                "Gabriela",
                "Michalina",
                "Kornelia",
                "Nikola",
                "Helena",
                "Milena",
                "Martyna",
                "Jagoda",
                "Karolina",
                "Agata",
                "Nina",
                "Magdalena",
                "Barbara",
                "Weronika",
                "Blanka",
                "Łucja",
                "Kaja",
                "Klara",
                "Anastazja",
                "Kinga",
                "Nela",
                "Mela",
                "Joanna",
                "Małgorzata",
                "Lilianna",
                "Paulina",
                "Sara",
                "Izabela",
                "Marta",
                "Matylda",
                "Katarzyna",
                "Aniela",
                "Róża",
                "Klaudia",
                "Ewa",
                "Eliza",
                "Patrycja",
                "Dominika",
                "Kalina",
                "Adrianna",
                "Urszula",
                "Rozalia",
                "Rose",
                "Lidia",
                "Olga",
                "Melania",
                "Malwina",
                "Liwia",
                "Bianka",
                "Daria",
                "Kamila",
                "Aurelia",
                "Dorota",
                "Sandra",
                "Mia",
                "Marika",
                "Ada",
                "Dagmara",
                "Roksana",
                "Jowita",
                "Ida",
                "Karina",
                "Inga",
                "Olivia",
                "Agnieszka",
                "Apolonia",
                "Elena",
                "Gaja",
                "Luiza",
                "Monika",
                "Justyna",
                "Diana",
                "Dianka",
                "Natasza",
                "Tola",
                "Emma",
                "Jadwiga",
                "Julita",
                "Nel",
                "Vanessa",
                "Rita",
                "Marlena",
                "Victoria",
                "Elżbieta",
                "Ela",
                "Nicola",
                "Lilia",
                "Anita",
                "Adela",
                "Ewelina",
                "Sonia",
                "Alina",
                "Stefania",
                "Celina",
                "Otylia",
                "Lea",
                "Lila",
                "Sabina",
                "Jaśmina",
                "Konstancja",
                "Julianna",
                "Sofia",
                "Krystyna",
                "Judyta",
                "Maya",
                "Amanda",
                "Faustyna",
                "Teresa",
                "Jessica",
                "Izabella",
                "Mila",
                "Sylwia",
                "Noemi",
                "Paula",
        };
        return names[getRandom(0, names.length - 1)];
    }

    private int getRandom(int min, int max) {
        return rand.nextInt(max - min + 1) + min;
    }
}