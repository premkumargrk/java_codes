// public class Shutdown {
//     public static void main(String[] args) {

//         // Registering a shutdown hook
//         Runtime.getRuntime().addShutdownHook(new Thread(() -> {
//             System.out.println("Shutdown Hook is running...");
//             System.out.println("Performing cleanup before exit...");
//         }));

//         System.out.println("Application is running...");
        
//         try {
//             Thread.sleep(3000); // Simulate some work
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }

//         System.out.println("Application is about to exit...");
//         System.exit(0);  // Triggers the shutdown hook
//     }
// }


import java.io.FileWriter;
import java.io.IOException;

// public class Shutdown {
//     public static void main(String[] args) {
//         try {
//             // Opening a file to write data
//             FileWriter writer = new FileWriter("example.txt");
//             writer.write("This is a demo content.\n");
//             System.out.println("Writing to file...");

//             // Registering a shutdown hook
//             Runtime.getRuntime().addShutdownHook(new Thread(() -> {
//                 try {
//                     System.out.println("Shutdown Hook: Closing the file...");
//                     writer.close();
//                     System.out.println("File closed successfully!");
//                 } catch (IOException e) {
//                     e.printStackTrace();
//                 }
//             }));

//             // Simulate long-running process
//             System.out.println("Application running... Press Ctrl + C to terminate.");
//             Thread.sleep(10000);

//         } catch (java.lang.Exception e) {
//             e.printStackTrace();
//         }
//     }
// }


public class Shutdown {
    private static String userProgress = "Level 4 - Score: 8500";

    public static void main(String[] args) {
        // Register shutdown hook to save progress before exiting
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutdown Hook: Saving user progress...");
            try (FileWriter writer = new FileWriter("user_state.txt")) {
                writer.write(userProgress);
                System.out.println("User progress saved successfully!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));

        System.out.println("Game running... press Ctrl + C to exit.");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
