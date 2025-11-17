import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        String urlString = "https://liveexample.pearsoncmg.com/data/Lincoln.txt";
        int wordCount = 0;

        try {
            // goes to url
            URL url = new URL(urlString);
            Scanner input = new Scanner(url.openStream());

            // counts
            while (input.hasNext()) {
                input.next();
                wordCount++;
            }

            input.close();
            // Prints 
            System.out.println("The Gettysburg Address contains " + wordCount + " words.");
        } catch (IOException ex) {
            System.out.println("Error: Unable to read from the URL.");
        }
    }
}
