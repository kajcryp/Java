package Song_Playlist;

public class Song {
    private String Title;
    private double Duration;

    public Song(String title, double duration) {
        Title = title;
        Duration = duration;
    }

    public String getTitle() {
        return Title;
    }

    public String toString(){
        return "Song title: " + Title + ":" + " song duration " + Duration;
    }


}
