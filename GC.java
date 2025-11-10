import java.lang.ref.Cleaner;

class Resource {
    // Create a Cleaner instance
    private static final Cleaner cleaner = Cleaner.create();

    private String name;

    // This inner class defines what happens during cleanup
    private static class State implements Runnable {
        private final String name;

        State(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            // This runs when GC collects the object
            System.out.println("Resource " + name + " is being cleaned up by Garbage Collector!");
        }
    }

    // Each Resource registers its own cleanup action
    private final Cleaner.Cleanable cleanable;

    public Resource(String name) {
        this.name = name;
        this.cleanable = cleaner.register(this, new State(name));
        System.out.println("Resource " + name + " is created.");
    }

    // Optional: manual cleanup method (not necessary, but for demonstration)
    public void close() {
        System.out.println("Resource " + name + " manually closed.");
        cleanable.clean(); // triggers cleanup immediately
    }
}

public class GC {
    public static void main(String[] args) throws InterruptedException {

        // Step 1: Create objects
        Resource r1 = new Resource("A");
        Resource r2 = new Resource("B");
        Resource r3 = new Resource("C");

        // Step 2: Make some objects eligible for GC
        r1 = null;
        r2 = null;

        System.out.println("\nRequesting Garbage Collection (First Time)...");
        System.gc();  // Suggest JVM to perform GC
        Thread.sleep(2000); // Give time for GC to run

        // Step 3: One object still in use
        System.out.println("\nCurrently active resource: " + r3);

        // Step 4: Manually close or make it eligible for GC
        r3.close(); // manual cleanup (shows alternative)
        r3 = null;

        System.out.println("\nRequesting Garbage Collection (Second Time)...");
        Runtime.getRuntime().gc();
        Thread.sleep(2000); // Wait to let GC perform

    }
}
