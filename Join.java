class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // Simulate some work
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted.");
            }
        }
        System.out.println(Thread.currentThread().getName() + " finished execution.\n");
    }
}

public class Join {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        // Start first thread
        t1.start();

        try {
            // Wait for t1 to complete before starting t2
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Start second thread
        t2.start();

        try {
            // Wait for t2 to complete before starting t3
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Start third thread
        t3.start();

        try {
            // Wait for t3 to complete before finishing main thread
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads have finished. Main thread exiting.");
    }
}
