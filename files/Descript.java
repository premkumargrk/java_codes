import java.io.*;

public class Descript {

    public static void main(String[] args) {

        try {
            // Step 1: Create log file
            File log = new File("C://secure//logs//descriptorLog.txt");
            log.getParentFile().mkdirs();
            log.createNewFile();

            // Step 2: Create OutputStream and get FileDescriptor
            FileOutputStream fos = new FileOutputStream(log, true);
            FileDescriptor fd = fos.getFD();

            System.out.println("FileDescriptor created: " + fd);

            // Step 3: Write some logs
            String entry = "Log entry at: " + System.currentTimeMillis() + "\n";
            fos.write(entry.getBytes());
            System.out.println("✔ Log written.");

            // Step 4: Sync the data to disk using descriptor
            fd.sync(); // Forces OS to write buffer to disk
            System.out.println("✔ FileDescriptor synced to disk.");

            // Step 5: Check if the descriptor is still valid
            System.out.println("Is descriptor valid? " + fd.valid());

            // Step 6: Use FileInputStream with the same descriptor
            FileInputStream fis = new FileInputStream(fd);
            // fos.close();
            // fis.close();  // java.io.IOException: Stream Closed
            System.out.println("\n--- Reading using FileDescriptor ---");
            int ch;
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }

            // Close streams
            // fos.close();
            // fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
