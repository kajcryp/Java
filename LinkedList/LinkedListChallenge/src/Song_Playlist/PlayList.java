package Song_Playlist;


import java.util.*;

public class PlayList {

    private static ArrayList<Album> Albums = new ArrayList<Album>();
    private static LinkedList<Song> Playlist = new LinkedList<Song>();

    public static void main(String[] args) {
        Album Chixtape = new Album("ChixTape", "Tory Lanez");
        Chixtape.addSong("The trade", 5.25);

        Chixtape.addSong("Read your mind", 4.29);
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

        play(Playlist);
    }

    private static void PlaylistOptions(){

    }

    private static void printMenuOptions(){
        System.out.println("Available actions: ");
        System.out.println("Press 0 to quit the Playlist\n" +
                           "Press 1 to go to the next song\n" +
                           "Press 2 to go back to the previous song\n" +
                           "Press 3 replay the song\n" +
                           "Press 4 display list of songs in playlist\n" +
                           "Press 5 to remove the song\n"
                           );
    }

    private static void displaySongs1(LinkedList<Song> playlist){
        for(int i = 0; i<playlist.size(); i++){
            System.out.println("song " + (i-1) + ": " + playlist.get(i).getTitle());
        }
    }

    private static void displaySongs2(LinkedList<Song> playlist){
        Iterator<Song> SongIterator = playlist.iterator();
        System.out.println("=====================");
        while(SongIterator.hasNext()){
            System.out.println(SongIterator.next());
        }
        System.out.println("=====================");
    }



    private static void play(LinkedList<Song> Playlist){
        System.out.println("Add a number to correspond to following menu options: ");
        printMenuOptions();

        Scanner newInput = new Scanner(System.in);
        boolean Quit = false;
        boolean isGoingForward = true;

        int newAction = newInput.nextInt();

        ListIterator<Song> PlaylistIterator = Playlist.listIterator();
        if(Playlist.size() ==0){
            System.out.println("There are no songs in this playlist");
        } else{
            System.out.println("Now playing: " + PlaylistIterator.next().toString());
            printMenuOptions();
            // you need the toString method to pull the value otherwise it would put some random code which represents the memory location
            // of where that particular object is
        }

        while(!Quit){
            switch (newAction){
                case 0:
                    System.out.println("Playlist is ocmplete");
                    Quit = true;
                    break;

                case 1: // skip forward
                    if(!isGoingForward) {
                        if (PlaylistIterator.hasNext()) {
                            PlaylistIterator.next();
                            System.out.println("We have gone to the next song");
                        }
                        isGoingForward = true; //checking to see if we're not going forward, we'll need to change directions and set it to going forward so the next line actually works
                    }
                    if(PlaylistIterator.hasNext()) {
                        System.out.println("Now playing: " + PlaylistIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        isGoingForward = false; // we set it to false as we can't forward anymore
                    }

                    break;

                case 2: // Going Backwards in playlist
                    if(isGoingForward) {
                        if (PlaylistIterator.hasPrevious()) {
                            PlaylistIterator.previous();
                        }
                        isGoingForward = false;
                    }
                    if(PlaylistIterator.hasPrevious()) {
                        PlaylistIterator.previous();
                        System.out.println("We have gone back to the previous song and now playing: " + PlaylistIterator.previous().toString());
                    } else {
                        System.out.println("We can't go back. This is the first track of the playlist");
                        isGoingForward = true;
                    }

                    break;

                case 3: //Replay songs
                    if(isGoingForward){ //First thing we need to do is find the direction of the linkedlist
                        if(PlaylistIterator.hasPrevious()){
                            System.out.println("Now replaying " + PlaylistIterator.previous().toString());
                            isGoingForward = false; // we're telling the system that we are going backwards
                        } else {
                            System.out.println("we are at the start of the list");
                        }
                    } else {
                        if (PlaylistIterator.hasNext()) {
                            System.out.println("Now replaying " + PlaylistIterator.next().toString());
                            isGoingForward = true; //This is set to true because we have to go forward to replay the song again
                        } else {
                            System.out.println("We have reached the end of the list ");
                        }
                    }
                    // So way it works is:
                    // If we're currently moving forward, check to see if there's a previous record.
                    // If there is, we move to the previous record and show name of the song as currently is before moving
                    // else we're at the start of the list
                    // Then opposite applies where we weren't moving forward and we go to the next record and replay it and set the direction to forward

                    break;

                case 4: // Display songs
                    displaySongs2(Playlist);
                    break;
                case 5:
                    PlaylistIterator.remove();

                    break;

                    }

        }

    }




}
