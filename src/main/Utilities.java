package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Utilities {
    /**
     * permet de transposer le html passé en paramettre dans le fichier Documentation/index.html
     * @param html
     */
    public static void writeHTMLToIndex(String html){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("documentation/index.html"));
            writer.write(html);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException("ecriture dans le fichier index.html echouée\n" + e);
        }
    }
}
