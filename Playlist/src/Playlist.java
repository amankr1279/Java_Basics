import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private final List<String> songs;

    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public List<String> getSongs() {
        return songs;
    }

    public int getSize() {
        return this.songs.size();
    }

    public void addSong(String song) {
        this.songs.add(song);
    }

    public PlaylistIterator makeIterator(String type) {
        return switch (type) {
            case "simple" -> new SimplePlaylistIterator(this);
            case "shuffle" -> new ShufflePlaylistIterator(this);
            case "fav" -> new FavPlaylistIterator(this);
            default -> null;
        };
    }
}
