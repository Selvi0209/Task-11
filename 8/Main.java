import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName = "profile.txt"; // Replace with the actual file name

        try {
            // Attempt to open and read from the file
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please provide a valid file path.");
        } catch (IOException e) {
            System.out.println("Error: An IO error occurred while reading the file.");
        }
    }
}
