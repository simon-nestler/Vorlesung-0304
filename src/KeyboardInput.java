import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

    public void viaBuffer() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try {
            System.out.println("Gebe Sie Ihren Namen ein:");
            String name = br.readLine();
            System.out.println("Gebe Sie Ihr Alter ein:");
            int alter = 0;

            while (alter == 0) {
                try {
                    alter = Integer.parseInt(br.readLine());
                } catch (NumberFormatException e) {
                    alter = 0;
                    System.out.println("Bitte geben Sie eine gültige Zahl ein.");
                }
            }

            System.out.println("Hallo " + name + ", Sie sind " + alter + " Jahre alt.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void viaBufferFromFile() {

        try {
            File file = new File("Max.txt");
            FileReader isr = new FileReader(file);
            BufferedReader br = new BufferedReader(isr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
