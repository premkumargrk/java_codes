import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class fileClass {
    public static void main(String[] args) {
        try {
            // 1. Create a directory using mkdir()
            File dir = new File("myData");
            if (dir.mkdir()) {
                System.out.println("Directory created: " + dir.getName());
            }

            // 2. Create a new file inside the directory
            File file = new File("myData/info.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            }

            // 3. Create a temporary file using createTempFile()
            File temp = File.createTempFile("test_", ".tmp");
            System.out.println("Temporary File: " + temp.getAbsolutePath());

            // 4. Check permissions and properties
            System.out.println("\n--- File Properties ---");
            System.out.println("Can Read: " + file.canRead());
            System.out.println("Can Write: " + file.canWrite());
            System.out.println("Can Execute: " + file.canExecute());

            System.out.println("Is Absolute Path? " + file.isAbsolute());
            System.out.println("Is File? " + file.isFile());
            System.out.println("Is Directory? " + file.isDirectory());

            // 5. Other information
            System.out.println("\n--- File Info ---");
            System.out.println("File Name: " + file.getName());
            System.out.println("Parent Directory: " + file.getParent());
            System.out.println("File Path as Path Object: " + file.toPath());
            System.out.println("File URI: " + file.toURI());

            // 6. Get free space in drive
            System.out.println("Free Disk Space (bytes): " + file.getFreeSpace());

            // 7. List all files in directory using listFiles()
            System.out.println("\n--- Files in Directory (listFiles) ---");
            File[] files = dir.listFiles();
            if (files != null) {
                for (File f : files) {
                    System.out.println("• " + f.getName() + " (isFile: " + f.isFile() + ")");
                }
            }

            // 8. Use list(FilenameFilter) to filter .txt files
            System.out.println("\n--- Filtered Files (.txt only) ---");
            String[] filtered = dir.list(new FilenameFilter() {
                @Override
                public boolean accept(File directory, String name) {
                    return name.endsWith(".txt");
                }
            });

            if (filtered != null) {
                for (String name : filtered) {
                    System.out.println("• " + name);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
