import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("A decorator demo for Lower case input stream");
        int c;
        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("src/abc.txt")
                    )
            );

            c = in.read();
            while (c > -1) {
                System.out.print((char) c);
                c = in.read();
            }

            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}