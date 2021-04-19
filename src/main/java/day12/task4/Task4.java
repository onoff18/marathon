package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        MusicBand mb1 = new MusicBand("Gusi Babusi", 2020, new ArrayList<>(Arrays.asList(
                "Guitarist1",
                "Keyboardist1",
                "Drummer1",
                "Singer1")));

        MusicBand mb2 = new MusicBand("Koni v yablokah", 2018, new ArrayList<>(Arrays.asList(
                "Guitarist2",
                "Keyboardist2",
                "Drummer2",
                "Singer2")));

        System.out.println(mb1.printMembers());
        System.out.println(mb2.printMembers());

        MusicBand.transferMembers(mb1, mb2);

        System.out.println(mb1.printMembers());
        System.out.println(mb2.printMembers());
    }
}

