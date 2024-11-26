import java.io.*;
import java.io.IOException;
import java.io.BufferedReader;
public class ReadFile {
    public static void main(String[] args){
        try (FileReader filereader = new FileReader("GJUST.txt");
        BufferedReader reader = new BufferedReader(filereader)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e);
        }
    }
}
