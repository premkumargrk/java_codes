public class Sleeps extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " running...");
            try {
                Thread.sleep(900,1000);
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted!");
            }
        }
    }

    public static void main(String[] args) {
        Sleeps t1 = new Sleeps();
        Sleeps t2 = new Sleeps();
        t1.start();
        t2.start();
    }
}
