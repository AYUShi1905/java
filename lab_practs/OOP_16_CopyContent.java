import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class OOP_16_CopyContent {
    public static void main(String[] args) {
        String sourceFilePath = "source.txt";
        String destinationFilePath = "destination.txt";
        try {
            Files.copy(Paths.get(sourceFilePath), Paths.get(destinationFilePath));
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.err.println("Error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}
