package com.example.kruligh.fejktinder;

import java.util.HashMap;
import java.util.Map;

public class Content {

    public Map<String, String> getLyrics() {
        return lyrics;
    }

    public void setLyrics(Map<String, String> lyrics) {
        this.lyrics = lyrics;
    }

    private Map<String, String> lyrics;

    public Map<String, ImageNotification> getImages() {
        return images;
    }

    public void setImages(Map<String, ImageNotification> images) {
        this.images = images;
    }

    private Map<String, ImageNotification> images;

    public Content() {
        this.lyrics = new HashMap<>();
        this.images = new HashMap<>();


        this.firstVerse();

        this.images.put("65", new ImageNotification("Gif na dziś", R.drawable.dj2));

    }

    private void firstVerse() {
        this.lyrics.put("1", "yoo \uD83D\uDC4A");
        this.lyrics.put("3", "to ja \uD83D\uDC30");
        this.lyrics.put("4", "ballada o białych paznokciach \uD83D\uDC85");
        this.lyrics.put("6", "jest rap jest mózg \uD83E\uDDE0");
        this.lyrics.put("7", "uczucia to nie obciach \uD83D\uDC93");
        this.lyrics.put("9", "hehe");

        this.lyrics.put("10", "Nagrywam to dla wszystkich wspaniałych dziewcząt \uD83D\uDE4B\u200D");
        this.lyrics.put("13", "I dla wszystkich facetów którzy \uD83D\uDE4B\u200D");
        this.lyrics.put("16", "Szukają swojej księżniczki \uD83D\uDC78");
        this.lyrics.put("18", "bedzie dobrze ; )");

        this.lyrics.put("21", "Krążę wokół Ciebie jak krążownik \uD83D\uDEF8 \uD83C\uDF0C \uD83D\uDC9E");
        this.lyrics.put("23", "Ksiażke przeczytałem, nawet słownik \uD83D\uDCDA \uD83D\uDCDA");
        this.lyrics.put("26", "Żeby odpisać Ci z przecinkiem, jak na Polskim \uD83D\uDCD1 \uD83D\uDCD5");
        this.lyrics.put("28", "I wysyłam emotki takie jak Ty");
        this.lyrics.put("30", "żeby sie upodobnić \uD83E\uDD13 \uD83D\uDD0E");

        this.lyrics.put("32", "Potem chcę wino, to wytrawne, czerwone \uD83C\uDF77 \uD83C\uDF77 \uD83C\uDF77");
        this.lyrics.put("34", "Okiem rzucę na Ciebie \uD83D\uDE0D");
        this.lyrics.put("35", "wybiorę słodkie, różowe \uD83C\uDF79");
        this.lyrics.put("38", "Mów o swoich bólach, lipa");
        this.lyrics.put("39", "narzekaj");
        this.lyrics.put("40", "głowa? \uD83D\uDE47\u200D");
        this.lyrics.put("41", "W moich googlach, klikam - apteka całodobowa \uD83D\uDD0E \uD83D\uDE91 \uD83D\uDC8A");

        this.lyrics.put("43", "Coś budzi we mnie to, że nie jesteś łatwa \uD83E\uDDD0");
        this.lyrics.put("46", "Pewnie się spóźnię bo");
        this.lyrics.put("47", "chciałem zdobyć \uD83C\uDF37 Cii \uD83D\uDC90");
        this.lyrics.put("48", "I wtedy mówisz że, yyy ta");
        this.lyrics.put("49", "ta koszula ładna \uD83D\uDC55");
        this.lyrics.put("51", "I wiemy w czym wyskoczę");
        this.lyrics.put("52", "żeby w weekend Cie gdzieś zabrać. \uD83D\uDE97 \uD83C\uDF07 \uD83C\uDFD6");

        this.lyrics.put("55", "Pajacuje jak pajac za jeden Twój \uD83D\uDE42 \uD83E\uDD38\u200D");
        this.lyrics.put("57", "Jak go nie widzę ranooo \uD83D\uDECC");
        this.lyrics.put("58", "ja jebie \uD83E\uDD26\u200D");
        this.lyrics.put("59", "prawie umre \uD83D\uDC80");
        this.lyrics.put("60", "Bedę");
        this.lyrics.put("61", "nieważne co by się działo");
        this.lyrics.put("62", "❓Możesz malować dla mnie paznokcie na biało❓");

        this.lyrics.put("64", "Bo mi się podobają");
    }


}

class ImageNotification {
    private String msg;
    private int image;

    public ImageNotification(String msg, int image) {
        this.msg = msg;
        this.image = image;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
