import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

    /**
     * Creates a {@code LowerCaseInputStream}
     * by assigning the  argument {@code in}
     * to the field {@code this.in} to remember it for later use.
     *
     * @param in the underlying input stream, or {@code null} if
     *           this instance is to be created without an underlying stream.
     */
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = in.read();

        if (c == -1) {
            return c;
        }
        char lowerCase = Character.toLowerCase((char) c);
        return lowerCase;
    }

    public int read(byte[] b) throws IOException {
        int result = in.read();
        for (int i = 0; i < b.length; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }
}
