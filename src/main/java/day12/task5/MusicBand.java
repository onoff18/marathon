package day12.task5;

import java.util.List;

public class MusicBand {

    private String name;
    private int year;
    private List<MusicArtist> musicArtists;

    public MusicBand(String name, int year, List<MusicArtist> musicArtists) {
        this.name = name;
        this.year = year;
        this.musicArtists = musicArtists;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<MusicArtist> getMembers() {
        return musicArtists;
    }

    public void setMusicArtists(List<MusicArtist> musicArtists) {
        this.musicArtists = musicArtists;
    }

    @Override
    public String toString() {
        return "MusicBand - " + name +  "; year = " + year +  "\n";
    }

    public String printMembers(){
        return musicArtists.toString();
    }

    public static void transferMembers (MusicBand band1, MusicBand band2) {
        for (MusicArtist artist : band1.getMembers()) {
            band2.getMembers().add(artist);
        }
        band1.getMembers().clear();
    }
}
