public class Threadintrpt {
    public static void main(String[] args) {
        Thread worker = new Thread(() -> {
            try {
                System.out.println("Worker thread started...");
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Working... step " + i);
                    Thread.sleep(4000); // Simulate work
                }
                System.out.println("Worker thread completed normally.");
            } catch (InterruptedException e) {
                System.out.println("Worker thread was interrupted!");
            }
        });

        worker.start();

        // Main thread interrupts after 4 seconds
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread sending interrupt signal...");
        worker.interrupt(); // Interrupt the worker thread
    }
}
