import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
public class Append {
    public static void main(String[] args) {
        File f=new File("example.txt");
        try {
            FileWriter writer = new FileWriter("example.txt", true); // true = append mode
            writer.write("\nThis line is appended to the file.");
            writer.close();
            System.out.println("Successfully appended to the file.");
            // if(writer.exists()){
            System.out.println("File Size (bytes): " + f.length());
            // }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
