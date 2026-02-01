public class FavPlaylistIterator implements PlaylistIterator{
    private final Playlist playlist;
    private int index;

    public FavPlaylistIterator(Playlist playlist) {
        this.playlist = playlist;
        this.index = 0;
    }

    @Override
    public String next() {
        String song = "None";
        if(this.hasNext() && this.playlist.getSong(this.index).contains("fav")) {
            song = this.playlist.getSong(this.index);
        }
        this.index += 1;
        return song;
    }

    @Override
    public boolean hasNext() {
        return this.index < playlist.getSize();
    }
}
