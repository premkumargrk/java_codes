class TimeThread extends Thread {
    public TimeThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " → Count: " + i);
            try {
                Thread.sleep(500); // simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class TimeSliced {
    public static void main(String[] args) {
        TimeThread t1 = new TimeThread("Thread-1");
        TimeThread t2 = new TimeThread("Thread-2");
        TimeThread t3 = new TimeThread("Thread-3");

        // All have equal priority
        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
