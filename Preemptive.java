class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() +
                               " (Priority: " + Thread.currentThread().getPriority() + ") - Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Preemptive {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Low-Priority Thread");
        MyThread t2 = new MyThread("High-Priority Thread");

        t1.setPriority(10); //1
        t2.setPriority(2);  // 10
                             
        t1.start();
        t2.start();
    }
}
