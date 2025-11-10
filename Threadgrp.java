// // File: ThreadGroupDemo.java
// import java.lang.ThreadGroup;

// class Workerthread extends Thread {
//     Workerthread(ThreadGroup group, String name) {
//         super(group, name);
//     }

//     @Override
//     public void run() {
//         try {
//             for (int i = 1; i <= 3; i++) {
//                 System.out.println(getName() + " is working... (Iteration " + i + ")");
//                 Thread.sleep(500);
//             }
//             System.out.println(getName() + " completed work.");
//         } catch (InterruptedException e) {
//             System.out.println(getName() + " interrupted!");
//         }
//     }
// }

// public class Threadgrp {
//     public static void main(String[] args) throws InterruptedException {

//         ThreadGroup group = new ThreadGroup("MyWorkerGroup");
//         System.out.println("Thread Group Name: " + group.getName());

//         System.out.println("Default Max Priority: " + group.getMaxPriority());
//         group.setMaxPriority(6);
//         System.out.println("New Max Priority: " + group.getMaxPriority());

//         Workerthread t1 = new Workerthread(group, "Worker-1");
//         Workerthread t2 = new Workerthread(group, "Worker-2");
//         Workerthread t3 = new Workerthread(group, "Worker-3");

//         t1.start();
//         t2.start();
//         t3.start();

//         System.out.println("Active threads (approx): " + group.activeCount());

//         System.out.println("\n--- Listing Threads ---");
//         group.list();

//         ThreadGroup childGroup = new ThreadGroup(group, "ChildGroup");
//         System.out.println("\nChild Group Created: " + childGroup.getName());
//         System.out.println("Parent of ChildGroup: " + childGroup.getParent().getName());

//         Thread.sleep(1500);
//         System.out.println("\nInterrupting all threads in group...");
//         group.interrupt();

//         t1.join();
//         t2.join();
//         t3.join();

//         // System.out.println("\nDestroying Thread Group...");
//         // group.destroy();
//         // System.out.println("Is group destroyed? " + group.isDestroyed());
//     }
// }


public class Threadgrp {
    public static void main(String[] args) {

        // Create a parent thread group
        ThreadGroup parentGroup = new ThreadGroup("ParentGroup");

        // Create a child thread group under the parent group
        ThreadGroup childGroup = new ThreadGroup(parentGroup, "ChildGroup");

        // Create threads in both groups
        Thread t1 = new Thread(parentGroup, () -> {
            System.out.println(Thread.currentThread().getName() + " running in " + Thread.currentThread().getThreadGroup().getName());
        }, "Parent-Thread-1");

        Thread t2 = new Thread(childGroup, () -> {
            System.out.println(Thread.currentThread().getName() + " running in " + Thread.currentThread().getThreadGroup().getName());
        }, "Child-Thread-1");

        // Start threads
        t1.start();
        t2.start();

        // Display hierarchy
        System.out.println("Parent group name: " + parentGroup.getName());
        System.out.println("Child group parent: " + childGroup.getParent().getName());
        System.out.println("Active thread count in parent: " + parentGroup.activeCount());
        System.out.println("Active group count in parent: " + parentGroup.activeGroupCount());

        // List all threads in both groups
        parentGroup.list();
    }
}
