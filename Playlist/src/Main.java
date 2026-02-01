public class Main {
    public static void main(String[] args) {
        System.out.println("Iterator Design patter: Playlists");
        Playlist playlist = new Playlist();
        playlist.addSong("In the End");
        playlist.addSong("Numb fav");
        playlist.addSong("Up from the bottom fav");
        playlist.addSong("The Emptiness Machine");
        playlist.addSong("Breaking Habit");
        playlist.addSong("What I have done fav");

        System.out.println("###Simple Iterator");
        SimplePlaylistIterator simplePlaylistIterator = new SimplePlaylistIterator(playlist);
        while (simplePlaylistIterator.hasNext()){
            System.out.println(simplePlaylistIterator.next());
        }

        System.out.println("###Shuffle Iterator");
        ShufflePlaylistIterator shufflePlaylistIterator = new ShufflePlaylistIterator(playlist);
//        while (shufflePlaylistIterator.hasNext()){
//            System.out.println(shufflePlaylistIterator.next());
//        }

        System.out.println("###Fav Iterator");
        FavPlaylistIterator favPlaylistIterator = new FavPlaylistIterator(playlist);
        while (favPlaylistIterator.hasNext()){
            System.out.println(favPlaylistIterator.next());
        }
    }
}