import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<String> songs;

    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public List<String> getSongs() {
        return songs;
    }

    public int getSize() {
        return this.songs.size();
    }

    public String getSong(int index) {
        return this.songs.get(index);
    }

    public void addSong(String song) {
        this.songs.add(song);
    }
}
