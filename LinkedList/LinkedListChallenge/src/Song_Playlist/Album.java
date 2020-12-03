package Song_Playlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    ArrayList<Song> AlbumSongs;
    //LinkedList<Song> AlbumSongs = new LinkedList<Song>();
    private String AlbumName;
    private String Artist;

    public Album(String albumName, String artist) {
        AlbumName = albumName;
        Artist = artist;
        this.AlbumSongs = new ArrayList<Song>();
    }

    public boolean addSong(String SongTitle, double duration){
        if(findSong2(SongTitle) == null){
            System.out.println("Song is not found. We will now add (" + SongTitle + ") now");
            Song newSong = new Song(SongTitle, duration);
            this.AlbumSongs.add(newSong);
            return true;
        }
        System.out.println("Song already there in branch");
        return false;
    }

    private Song findSong(String SongTitle){
        for(int i = 0; i < AlbumSongs.size(); i++){
            Song AlbumSong = this.AlbumSongs.get(i);
            String AlbumSongTitle = AlbumSong.getTitle();
            if(AlbumSongTitle.equals(SongTitle)){
                return AlbumSong;
            }
        }

        return null;
    }

    private Song findSong2(String SongTitle){
        for(Song checkedSong: this.AlbumSongs){ // alternative way to look at list of entries. What this does is goes through and creates a variable called CheckedSong for every entry in the arraylist,
                                                // Java will automatically create this variable called checkedSong and from there we'd use it like i++
            if(checkedSong.getTitle().equals(SongTitle)){   //So if we do find the title, we'll return the checkedSong
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlaylistTrackNo(int trackNumber, LinkedList<Song> Playlist){
        int index = trackNumber - 1;                            //internally arraylist, counting starts form 0 so -1.
        if((index >= 0) && (index < this.AlbumSongs.size())){        //Checking the song in the entry.
            Playlist.add(this.AlbumSongs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylistSongTitle(String songTitle, LinkedList<Song> Playlist){
        Song checkedSong = findSong2(songTitle);
        if(checkedSong != null){
            Playlist.add(checkedSong);
            System.out.println("Song " + songTitle + " will be added to playlist.");
            return true;
        }

        System.out.println("Song " + songTitle + " is already in playlist.");
        return false;
    }



/*    private static boolean addSong(LinkedList<String> album, String newSong){
        ListIterator<String> AlbumIterator = album.listIterator();

        while(AlbumIterator.hasNext()){
            String CurrentSong = AlbumIterator.next(); // Trying to find the name of the current song at linked List whilst move to the next song as well
            int Comparison = CurrentSong.compareTo(newSong);
            if(Comparison ==0) {
                System.out.println("This song: " + newSong + " is already in the list");
                return false;
            } else if (Comparison > 0){
                AlbumIterator.previous();
                AlbumIterator.add(newSong);
                return true;
            } else if (Comparison < 0){

            }

        }

        AlbumIterator.add(newSong);
        return true;
    }
*/




}
