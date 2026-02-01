import java.util.Random;

public class ShufflePlaylistIterator implements PlaylistIterator{
    private final Playlist playlist;
    private int index;

    public ShufflePlaylistIterator(Playlist playlist) {
        this.playlist = playlist;
        this.index = 0;
    }

    @Override
    public String next() {
        Random r = new Random();
        this.index = r.nextInt(this.playlist.getSize());
        return this.playlist.getSong(index);

    }

    @Override
    public boolean hasNext() {
        return true;
    }
}
