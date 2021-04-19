package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        MusicArtist ma1 = new MusicArtist("Guitarist1", 1992);
        MusicArtist ma2 = new MusicArtist("Guitarist2", 1996);
        MusicArtist ma3 = new MusicArtist("Drummer1", 1998);
        MusicArtist ma4 = new MusicArtist("Drummer2", 2000);

        List<MusicArtist> musicArtists1 = new ArrayList<>(new ArrayList<>(Arrays.asList(ma1, ma3)));
        List<MusicArtist> musicArtists2 = new ArrayList<>(new ArrayList<>(Arrays.asList(ma2, ma4)));

        MusicBand mb1 = new MusicBand("ChaChaCha", 2010, musicArtists1);
        MusicBand mb2 = new MusicBand("ChoChoCho", 2011, musicArtists2);

        System.out.println(mb1.printMembers());
        System.out.println(mb2.printMembers());

        MusicBand.transferMembers(mb1, mb2);

        System.out.println(mb1.printMembers());
        System.out.println(mb2.printMembers());
    }
}
