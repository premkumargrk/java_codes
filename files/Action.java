import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.security.Permission;
import java.security.PermissionCollection;
import java.io.FilePermission;

public class Action {

    public static void main(String[] args) {

        try {
            // 1. Secure log file location
            String logPath = "C:/secure/logs/app.log";
            File logFile = new File(logPath);

            // Create directory if not exists
            logFile.getParentFile().mkdirs();
            logFile.createNewFile();

            // 2. Assign allowed permissions (read & write)
            FilePermission allowedPermission =
                    new FilePermission(logPath, "read,write");

            // 3. Build PermissionCollection
            PermissionCollection permissions = allowedPermission.newPermissionCollection();
            permissions.add(allowedPermission);

            // Test permissions
            testPermissions(allowedPermission);

            System.out.println("\n--- Performing Secure File Operations ---\n");

            // 4. Perform file operation WITH permission checking
            if (permissions.implies(new FilePermission(logPath, "write"))) {
                writeLog(logFile, "User login success at: " + System.currentTimeMillis());
            }

            if (permissions.implies(new FilePermission(logPath, "read"))) {
                readLog(logFile);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Write to log file
    private static void writeLog(File file, String data) throws IOException {
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write(data + "\n");
            System.out.println("✔ Log written successfully.");
        }
    }

    // Read from log file
    private static void readLog(File file) throws IOException {
        try (FileReader fr = new FileReader(file)) {
            System.out.println("✔ Reading logs:");
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        }
    }

    // Show key FilePermission methods
    private static void testPermissions(FilePermission permission) {

        System.out.println("--- Testing FilePermission Features ---");

        // A similar permission object to compare
        FilePermission samePermission =
                new FilePermission("C:/secure/logs/app.log", "read,write");

        System.out.println("Permission Path: " + permission.getName());
        System.out.println("Allowed Actions: " + permission.getActions());
        System.out.println("HashCode: " + permission.hashCode());
        System.out.println("Equals Same Permission: " + permission.equals(samePermission));

        // Check implies()
        FilePermission readOnly =
                new FilePermission("C:/secure/logs/app.log", "read");

        System.out.println("Does read/write imply read? " + permission.implies(readOnly));
    }
}
