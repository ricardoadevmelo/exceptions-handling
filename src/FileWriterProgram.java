import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterProgram {
    public static void main(String[] args) {

        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};

        String path = "D:\\out.txt";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))){

            for (String line : lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }
}