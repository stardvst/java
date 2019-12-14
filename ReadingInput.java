import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadingInput {
    public static void main(String[] args) {
        int age = 0;

        String input = JOptionPane.showInputDialog("How old are you?");

        // reads chars
        InputStreamReader reader = new InputStreamReader(System.in);

        // reads a string
        BufferedReader console = new BufferedReader(reader);

        System.out.println("How old are you?");

        try {
            input = console.readLine();
        } catch (java.io.IOException ex) {
            ex.printStackTrace();
        }

        if (input != null) age = Integer.parseInt(input);
        System.out.println("Age is " + age);
    }
}