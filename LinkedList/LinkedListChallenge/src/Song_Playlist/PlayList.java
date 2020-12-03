package Song_Playlist;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class PlayList {

    private static ArrayList<Album> Albums = new ArrayList<Album>();
    private static LinkedList<Song> Playlist = new LinkedList<Song>();

    public static void main(String[] args) {
        Album Chixtape = new Album("ChixTape", "Tory Lanez");
        Chixtape.addSong("The trade", 5.25);

        Chixtape.addSong("Read your mind", 4.29;
        Chixtape.addSong("Yessir", 3.25);
        Chixtape.addSong("Jerry Sprunger", 5.25);
        Chixtape.addSong("The take", 4.31);

        Albums.add(Chixtape);

        Album GetRichOrDieTrying = new Album("Get Rich or Die Trying", "50 Cent");

        GetRichOrDieTrying.addSong("Many Men", 4.31);
        GetRichOrDieTrying.addSong("In da club", 3.59);
        GetRichOrDieTrying.addSong("Don't Push me", 3.49);
        GetRichOrDieTrying.addSong("High all the Time", 4.29);

        Albums.add(GetRichOrDieTrying);

        Albums.get(0).addToPlaylistSongTitle("Yessir", Playlist);
        Albums.get(0).addToPlaylistSongTitle("The take", Playlist);
        Albums.get(0).addToPlaylistSongTitle("A fool's tale", Playlist); //does not exist
        Albums.get(0).addToPlaylistTrackNo(3, Playlist);
        Albums.get(1).addToPlaylistTrackNo(3, Playlist);
        Albums.get(1).addToPlaylistTrackNo(1, Playlist);
        Albums.get(1).addToPlaylistTrackNo(2, Playlist);
        Albums.get(1).addToPlaylistTrackNo(2, Playlist);
    }

forbidden

    private static void printMenuOptions(){
        System.out.println("Press 1 to go back to the previous song" +
                           "Press 2 to go to the next song" +
                           "Press 3 replay the song" +
                           "Press 4 to quit action");
    }

    private static void menuOptions(){
        Scanner newInput = new Scanner(System.in);
        int newAction = newInput.nextInt();

        switch (newAction){
            case 1:
                if()
        }

    }


}
