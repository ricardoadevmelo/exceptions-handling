import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderProgram {
    public static void main(String[] args) {

        String path = "D:\\macrosWAR-cache.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){

            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException exception) {
            System.out.println("Error: " + exception.getMessage());
        }

    }
}