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
        this.secondVerse();
        this.thirdVerse();

        this.images.put("70", new ImageNotification("Gif na dziś", R.drawable.dj2));
        this.images.put("122", new ImageNotification("Gif na dziś", R.drawable.dj2));

    }

    private void thirdVerse() {
        int minuteDelay = 120;
        this.lyrics.put(minuteDelay + 22 + "", "hej");
        this.lyrics.put(minuteDelay + 23 + "", "w sumie przepraszam za wczoraj \uD83E\uDD37\u200D");
        this.lyrics.put(minuteDelay + 25 + "", "zrobiłem Ci brony, kurwa z parasola");
        this.lyrics.put(minuteDelay + 26 + "", "z igły widły w sensie \uD83D\uDE05");
        this.lyrics.put(minuteDelay + 28 + "", "byłem pijany");
        this.lyrics.put(minuteDelay + 29 + "", "mogłem Ci nic pisać \uD83E\uDD26\u200D");
        this.lyrics.put(minuteDelay + 30 + "", "ale tak to czytam, w morde bita, prawda z życia \uD83D\uDE43");

        this.lyrics.put(minuteDelay + 34 + "", "bo chciałem najebać hindusa \uD83E\uDD4A \uD83E\uDD4B");
        this.lyrics.put(minuteDelay + 36 + "", "bo chciał łapać Cię za tyłek?");
        this.lyrics.put(minuteDelay + 38 + "", "no jakoś mnie to rusza \uD83E\uDD10");
        this.lyrics.put(minuteDelay + 39 + "", "i jak niby mam mieć wyjebane \uD83E\uDD2C");
        this.lyrics.put(minuteDelay + 41 + "", "na to że potem siedzisz z pyskiem ciągle w instagramie \uD83D\uDCF1 \uD83E\uDD33");

        this.lyrics.put(minuteDelay + 45 + "", "ile dałbym byś zapomniała problem");
        this.lyrics.put(minuteDelay + 47 + "", "który zrobiłem że pisałaś z tamtym gościem \uD83D\uDD75️\u200D");
        this.lyrics.put(minuteDelay + 50 + "", "nawet z tym pajacem na bank się zgodzimy \uD83E\uDD1C \uD83E\uDD1B");
        this.lyrics.put(minuteDelay + 52 + "", "coś jest nie tak jak typ odwiedza Cię w Twoje w urodziny \uD83C\uDF82 \uD83C\uDF7E");

        this.lyrics.put(minuteDelay + 56 + "", "szkoda że na zgode nie chcesz dać mi \uD83D\uDC8B");
        this.lyrics.put(minuteDelay + 59 + "", "trudno kurwa");
        this.lyrics.put(minuteDelay + 60 + "", "będę duży \uD83D\uDC66");
        this.lyrics.put(minuteDelay + 61 + "", "miałem być, nieważne co by się działo");
        this.lyrics.put(minuteDelay + 63 + "", "ale przynajmniej nie musisz malować paznokci na biało");

        this.lyrics.put(minuteDelay + 65 + "", "a mi się serio podobają \uD83D\uDE0D");

    }

    private void secondVerse() {
        int minuteDelay = 59;

        this.lyrics.put(minuteDelay + 16 + "", "Musisz się uczyć?");
        this.lyrics.put( minuteDelay + 17 + "", "okej spoko");
        this.lyrics.put(minuteDelay + 18 + "", "ważna sprawa");
        this.lyrics.put(minuteDelay + 20 + "", "Tylko szkoda że się najebałaś xd");
        this.lyrics.put(minuteDelay + 22 + "", "nastepnym razem");
        this.lyrics.put(minuteDelay + 23 + "", "jakbyś nie chciała się spotkać");
        this.lyrics.put(minuteDelay + 25 + "", "możesz powiedzieć nie wiem kurwa");
        this.lyrics.put(minuteDelay + 26 + "", "nie chce się spotkać?");

        this.lyrics.put(minuteDelay + 28 + "", "nie jestem pępkiem świata");
        this.lyrics.put(minuteDelay + 30 + "", "trudno");
        this.lyrics.put(minuteDelay + 31 + "", "ciągle mówisz że nim będę jutro");
        this.lyrics.put(minuteDelay + 33 + "", "ale chuj w to");
        this.lyrics.put(minuteDelay + 34 + "", "idziemy spotkać Twoje dziewczyny");
        this.lyrics.put(minuteDelay + 35 + "", "bo jakaś Asia");
        this.lyrics.put(minuteDelay + 36 + "", "akurat jutro");
        this.lyrics.put(minuteDelay + 37 + "", "ma urodziny xd");

        this.lyrics.put(minuteDelay + 39 + "", "Jeżdzę pół miasta po Twoje jebane pierogi");
        this.lyrics.put(minuteDelay + 42 + "", "Jeszcze mi mówisz zostaw, mam nie ogolone nogi");
        this.lyrics.put(minuteDelay + 45 + "", "I bez łaski, choć bym wziął Cię chętniej niż hajsik \uD83D\uDE05");
        this.lyrics.put(minuteDelay + 47 + "", "I bez laski");
        this.lyrics.put(minuteDelay + 48 + "", "jak zwykle kurwa cooo");

        this.lyrics.put(minuteDelay + 49 + "", "chuj");
        this.lyrics.put(minuteDelay + 50 + "", "daje z siebie robić frajera");
        this.lyrics.put(minuteDelay + 52 + "", "tylko po to żebyś się uśmiechnęła");
        this.lyrics.put(minuteDelay + 54 + "", "i pamiętaj bedę, nieważne co by się działo \uD83D\uDC96");
        this.lyrics.put(minuteDelay + 57 + "", "tylko");
        this.lyrics.put(minuteDelay + 58 + "", "czy pomalujesz dla mnie paznokcie na biało?");

        this.lyrics.put(minuteDelay + 60 + "", "Bo mi się kurwa podobają \uD83D\uDE01 \uD83D\uDE01 \uD83D\uDE01");
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
        this.lyrics.put("26", "Żeby odpisać Ci z przecinkiem, jak na Polskim \uD83D\uDCD1 \uD83D\uDCD5 \uD83C\uDF92");
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
        this.lyrics.put("45", "Pewnie się spóźnię bo");
        this.lyrics.put("46", "chciałem zdobyć \uD83C\uDF37 Cii \uD83D\uDC90");
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
