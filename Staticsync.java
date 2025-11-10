// class Bank {
//     private static double interestRate = 7.0; // shared among all accounts

//     // static synchronized method to safely update the rate
//     public static synchronized void updateInterestRate(String admin, double newRate) {
//         System.out.println(admin + " is updating the interest rate...");
//         try {
//             Thread.sleep(2000); // simulate delay
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }

//         interestRate = newRate;
//         System.out.println(admin + " updated interest rate to " + interestRate + "%");
//     }

//     // static method to check current rate
//     public static void showInterestRate() {
//         System.out.println("Current Bank Interest Rate: " + interestRate + "%");
//     }
// }

// // Thread class representing an admin operation
// class AdminThread extends Thread {
//     private String adminName;
//     private double newRate;

//     public AdminThread(String adminName, double newRate) {
//         this.adminName = adminName;
//         this.newRate = newRate;
//     }

//     @Override
//     public void run() {
//         Bank.updateInterestRate(adminName, newRate);
//     }
// }

// public class Staticsync {
//     public static void main(String[] args) throws InterruptedException {
//         System.out.println("=== Bank Interest Rate Update Simulation ===\n");

//         Bank.showInterestRate();

//         // Two admins trying to update rate simultaneously
//         AdminThread admin1 = new AdminThread("Indian Bank", 4.2);
//         AdminThread admin2 = new AdminThread("HDFC Bank", 7.69);
//         AdminThread admin3 = new AdminThread("SBI Bank", 10.19);
       
//         admin1.start();
//         admin2.start();
//         admin3.start();

//         admin1.join();
//         admin2.join();
//         admin3.join();

//         System.out.println("\nFinal Interest Rate After Updates:");
//         Bank.showInterestRate();
//     }
// }

class Bank {
    private static int balance = 1000; // Shared among all accounts

    // Static synchronized method — locks the Bank.class object
    public static synchronized void deposit(String name, int amount) {
        System.out.println(name + " is depositing " + amount + "...");
        balance += amount;
        System.out.println(name + " completed deposit. New balance: " + balance);
    }

    // Another static synchronized method
    public static synchronized void withdraw(String name, int amount) {
        System.out.println(name + " is withdrawing " + amount + "...");
        if (balance >= amount) {
            balance -= amount;
            System.out.println(name + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance for " + name);
        }
    }
}

class Customer extends Thread {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void run() {
        // Both static synchronized methods share the same class-level lock
        Bank.deposit(name, 32000);
        Bank.withdraw(name, 8500);
    }
}

public class Staticsync {
    public static void main(String[] args) {
        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");
        Customer c3 = new Customer("Charlie");
        Customer c4=new Customer("Dennis");

        // Starting multiple threads that access static synchronized methods
        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}
