import java.io.IOException;

public class KeyboardInput {

    public KeyboardInput() {

    }

    public void viaSystemIn() throws IOException {
        int i = 100;

        while (i > 31) {
            i = System.in.read();
            System.out.print((char) i);
        }
    }

    public void viaGUI() {
        String s = javax.swing.JOptionPane.showInputDialog("Enter a number");
        int i = Integer.parseInt(s);
        System.out.println(i);
    }
}
