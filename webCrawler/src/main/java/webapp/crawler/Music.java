package webapp.crawler;

public class Music {
    private String name;
    private String format;
    private int year;
    private String artist;

    public Music() {
    }

    public Music(String name, String format, int year, String artist) {
        this.name = name;
        this.format = format;
        this.year = year;
        this.artist = artist;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public String getFormat() {
        return format;
    }

    public int getYear() {
        return year;
    }

    public String getArtist() {
        return artist;
    }
}
