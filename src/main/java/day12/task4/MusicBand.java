package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {

    private final String name;
    private int year;
    private List<String> bandMembers;

    public MusicBand(String name, int year, List<String> bandMembers) {
        this.name = name;
        this.year = year;
        this.bandMembers = bandMembers;
    }

    public List<String> getMembers() {
        return bandMembers;
    }

    public void addBandMember (String bandMember) {
        bandMembers.add(bandMember);
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MusicBand - " + name +  "; year = " + year +  "\n";
    }

    public List<String> printMembers(){
        return bandMembers;
    }

    public static void transferMembers (MusicBand band1, MusicBand band2) {
        for (String member : band1.getMembers()) {
            band2.addBandMember(member);
        }
        band1.getMembers().clear();
    }

}
