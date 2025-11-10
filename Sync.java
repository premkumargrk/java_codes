// Without using synchronized
// class Counter {
//     int count = 0;   // shared resource

//     void increment() {
//         count++;     // not thread-safe
//     }
// }

// public class Sync {
//     public static void main(String[] args) throws InterruptedException {
//         Counter c = new Counter();

//         // Two threads incrementing count
//         Thread t1 = new Thread(() -> {
//             for (int i = 0; i < 10000000; i++)
//                 c.increment();
//         });

//         Thread t2 = new Thread(() -> {
//             for (int i = 0; i < 10000000; i++)
//                 c.increment();
//         });

//         t1.start();
//         t2.start();

//         // Wait for both threads to finish
        
//         t1.join();
//         t2.join();
        

//         System.out.println("Final Count (without sync): " + c.count);
//     }
// }



// using synchronized
class Counter {
    int count = 0;   // shared resource

    synchronized void increment() {
        count++;     // not thread-safe
    }
}

public class Sync {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        // Two threads incrementing count
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000000; i++)
                c.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000000; i++)
                c.increment();
        });

        t1.start();
        t2.start();

        // Wait for both threads to finish
        
        t1.join();
        t2.join();
        

        System.out.println("Final Count (without sync): " + c.count);
    }
}



