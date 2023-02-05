import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PathProgram {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String stringPath = scanner.nextLine();

        File path = new File(stringPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS:");
        for (File folder : folders) {
            System.out.println(folder);
        }

        System.out.println();

        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES:");
        for (File file : files) {
            System.out.println(file);
        }

        System.out.println();

        boolean success = new File((stringPath + "\\subdir")).isFile();
        System.out.println("Directory created successfully: " + success);

        scanner.close();
    }
}