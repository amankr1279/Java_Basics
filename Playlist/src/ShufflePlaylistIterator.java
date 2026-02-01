import java.util.Collections;
import java.util.List;

public class ShufflePlaylistIterator implements PlaylistIterator{
    private final Playlist playlist;
    private List<String> shuffledSongs;
    private int index;

    public ShufflePlaylistIterator(Playlist playlist) {
        this.playlist = playlist;
        this.shuffledSongs = this.playlist.getSongs();
        Collections.shuffle(this.shuffledSongs);
        this.index = 0;
    }

    @Override
    public String next() {
        String song = null;
        if(this.hasNext()) {
            song = this.shuffledSongs.get(this.index);
        }
        this.index += 1;
        return song;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.shuffledSongs.size();
    }
}
