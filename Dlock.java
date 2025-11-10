class SharedResource {
    void methodA(SharedResource res) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " locked " + this);
            
            try {
                Thread.sleep(100); // simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " trying to lock " + res);
            synchronized (res) {
                System.out.println(Thread.currentThread().getName() + " locked both resources");
            }
        }
    }
}

public class Dlock {
    public static void main(String[] args) {
        SharedResource r1 = new SharedResource();
        SharedResource r2 = new SharedResource();

        // Thread 1 tries to lock r1 then r2
        Thread t1 = new Thread(() -> r1.methodA(r2), "Thread-1");

        // Thread 2 tries to lock r2 then r1
        Thread t2 = new Thread(() -> r2.methodA(r1), "Thread-2");

        t1.start();
        t2.start();
    }
}
