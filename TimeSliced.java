class TimeThread extends Thread {
    public TimeThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " -> Count: " + i);
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
        TimeThread t4 = new TimeThread("Thread-4");
        // All have equal priority
        t1.setPriority(4);
        t2.setPriority(3);
        t3.setPriority(1);
        t4.setPriority(2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
