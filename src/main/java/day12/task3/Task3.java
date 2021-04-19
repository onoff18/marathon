package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        MusicBand musicBand1 = new MusicBand("Nochi Pokochi", 2000);
        MusicBand musicBand2 = new MusicBand("Pyatnchnie Tethi", 2021);
        MusicBand musicBand3 = new MusicBand("Ubit Komara", 2018);
        MusicBand musicBand4 = new MusicBand("Chipsi s Kartoshkoy", 2010);
        MusicBand musicBand5 = new MusicBand("Uho Medvedya", 2003);
        MusicBand musicBand6 = new MusicBand("Guslyary Tsarya", 2008);
        MusicBand musicBand7 = new MusicBand("Zeleniy Paketik", 2003);
        MusicBand musicBand8 = new MusicBand("Nochnoy Voy", 2005);
        MusicBand musicBand9 = new MusicBand("Bezalkogolniy Samogon", 1995);
        MusicBand musicBand10 = new MusicBand("Pyanie Baby", 1998);
        MusicBand musicBand11 = new MusicBand("Syny Buzovoy", 1965);
        MusicBand musicBand12 = new MusicBand("Zaghatie Yaitsa", 1988);
        MusicBand musicBand13 = new MusicBand("Trapharet Slona", 1933);
        MusicBand musicBand14 = new MusicBand("Lozhkari Krasnodara", 1922);
        MusicBand musicBand15 = new MusicBand("Nemetskaya Lubov", 1912);

        List<MusicBand> musicBands = new ArrayList<>();

        musicBands.add(musicBand1);
        musicBands.add(musicBand2);
        musicBands.add(musicBand3);
        musicBands.add(musicBand4);
        musicBands.add(musicBand5);
        musicBands.add(musicBand6);
        musicBands.add(musicBand7);
        musicBands.add(musicBand8);
        musicBands.add(musicBand9);
        musicBands.add(musicBand10);
        musicBands.add(musicBand11);
        musicBands.add(musicBand12);
        musicBands.add(musicBand13);
        musicBands.add(musicBand14);
        musicBands.add(musicBand15);

        System.out.println(musicBands);

        Collections.shuffle(musicBands);

        System.out.println(groupsAfter2000(musicBands));
    }
    public static List<MusicBand> groupsAfter2000 (List<MusicBand> bands) {

        List<MusicBand> groupsAfter2000 = new ArrayList<>();

        for (MusicBand band : bands) {
            if (band.getYear() >= 2000) {
                groupsAfter2000.add(band);
            }
        }
        return groupsAfter2000;
    }
}
