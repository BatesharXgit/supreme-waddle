import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;

public class WriteToFile {
    public static void main(String[] args) {
        // Specify the file name
        String fileName = "GJUST.txt";

        // Content to write to the file
        String[] lines = {
                "Guru Jambheshwar University of Science and Technology, Hisar",
                "It was established in 1995.",
                "The university offers various undergraduate and postgraduate programs.",
                "GJUST is a hub for technical and management studies in Haryana."
        };

        // Try-with-resources statement to auto-close the FileWriter
        try (FileWriter writer = new FileWriter(fileName)) {
            // Writing each line to the file
            for (String line : lines) {
                writer.write(line + "\n");  // Write the line followed by a newline
            }
            System.out.println("Data written to file: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Reading the file back (this is done separately after writing)
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader reader = new BufferedReader(fileReader)) {

            String line;
            System.out.println("Reading data from file:");
            // Read each line from the file
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }
}
