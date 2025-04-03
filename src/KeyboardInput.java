import java.io.IOException;

public class KeyboardInput {

    public KeyboardInput() throws IOException {
        int i = 100;

        while (i > 31) {
            i = System.in.read();
            System.out.print((char) i);
        }
    }
}
