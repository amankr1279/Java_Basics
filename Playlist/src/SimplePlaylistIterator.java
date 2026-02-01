public class SimplePlaylistIterator implements PlaylistIterator{
    private final Playlist playlist;
    private int index;

    public SimplePlaylistIterator(Playlist playlist) {
        this.playlist = playlist;
        this.index = 0;
    }

    @Override
    public String next() {
        String song = "None";
        if(this.hasNext()) {
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
