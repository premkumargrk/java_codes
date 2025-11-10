public class Runtimes {
    public static void main(String[] args) {
        // 1. Get Runtime instance
        Runtime runtime = Runtime.getRuntime();

        // 2. availableProcessors()
        System.out.println("Available processors: " + runtime.availableProcessors());

        // 3. totalMemory() and freeMemory()
        System.out.println("Total memory (bytes): " + runtime.totalMemory());
        System.out.println("Free memory before creating objects (bytes): " + runtime.freeMemory());

        // Create objects to use memory
        for (int i = 0; i < 10000; i++) {
            new Object();
        }

        System.out.println("Free memory after creating objects (bytes): " + runtime.freeMemory());

        // 4. Run garbage collector
        runtime.gc();
        System.out.println("Free memory after garbage collection (bytes): " + runtime.freeMemory());

        // 5. Use ProcessBuilder instead of exec()
        try {
            System.out.println("Opening a text editor...");
            
            // Use platform-independent way
            ProcessBuilder pb;
            String os = System.getProperty("os.name").toLowerCase();

            if (os.contains("win")) {
                pb = new ProcessBuilder("notepad.exe");
            } else if (os.contains("mac")) {
                pb = new ProcessBuilder("open", "-a", "TextEdit");
            } else {
                pb = new ProcessBuilder("gedit");
            }

            pb.start(); // starts the external process safely
        } catch (java.lang.Exception e) {
            System.out.println("Error while opening the editor: " + e.getMessage());
        }

        // 6. addShutdownHook()
        runtime.addShutdownHook(new Thread() {
            public void run() {
                System.out.println("Shutdown Hook: Cleaning up before exit...");
            }
        });

        // 7. exit()
        System.out.println("Exiting program...");
        runtime.exit(0);
    }
}
