import java.io.File;

public class Getinfo {
    public static void main(String[] args) {
        // Create a File object pointing to your file
        File file = new File("example.txt");

        // Check if file exists
        if (file.exists()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Parent Directory: " + file.getParent());

            System.out.println("Is File Writable? " + file.canWrite());
            System.out.println("Is File Readable? " + file.canRead());
            System.out.println("Is File Executable? " + file.canExecute());

            System.out.println("Is it a File? " + file.isFile());
            System.out.println("Is it a Directory? " + file.isDirectory());

            System.out.println("File Size (bytes): " + file.length());
            System.out.println("Last Modified: " + file.lastModified());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
