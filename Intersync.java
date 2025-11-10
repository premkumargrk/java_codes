// class Message {
//     private String msg;

//     public synchronized void writeMessage(String msg) {
//         this.msg = msg;
//         System.out.println("Writer: Message written -> " + msg);
//         notify(); // Notify the reader that message is ready
//     }

//     public synchronized void readMessage() {
//         try {
//             System.out.println("Reader: Waiting for message...");
//             wait(); // Wait until a message is written
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//         System.out.println("Reader: Message received -> " + msg);
//     }
// }

// public class Intersync {
//     public static void main(String[] args) {
//         Message message = new Message();

//         Thread reader = new Thread(() -> message.readMessage());
//         Thread writer = new Thread(() -> {
//             try {
//                 Thread.sleep(1000); // delay so reader waits first
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//             message.writeMessage("Hello from Writer!");
//         });

//         reader.start();
//         writer.start();
//     }
// }


// class SharedData {
//     private boolean ready = false;

//     // Reader threads wait until data is ready
//     public synchronized void readData() {
//         while (!ready) {
//             try {
//                 System.out.println(Thread.currentThread().getName() + " is waiting...");
//                 wait(); // Wait until writer notifies
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//         System.out.println(Thread.currentThread().getName() + " got the message!");
//     }

//     // Writer thread notifies all readers
//     public synchronized void writeData() {
//         System.out.println("\nWriter: Data is ready, notifying all readers...");
//         ready = true;
//         notifyAll(); // Wake up all waiting threads
//     }
// }

// public class Intersync {
//     public static void main(String[] args) {
//         SharedData shared = new SharedData();

//         // Create multiple reader threads
//         Thread reader1 = new Thread(shared::readData, "Reader-1");
//         Thread reader2 = new Thread(shared::readData, "Reader-2");
//         Thread reader3 = new Thread(shared::readData, "Reader-3");

//         // Writer thread
//         Thread writer = new Thread(() -> {
//             try {
//                 Thread.sleep(2000); // Let readers wait first
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//             shared.writeData();
//         }, "Writer");

//         // Start all threads
//         reader1.start();
//         reader2.start();
//         reader3.start();
//         writer.start();
//     }
// }



// class Kitchen {
//     private String food;
//     private boolean foodReady = false;

//     // Chef prepares food
//     public synchronized void prepareFood(String dish) {
//         while (foodReady) {
//             try {
//                 System.out.println("Chef waiting — food not yet served...");
//                 wait(); // Wait until waiter serves the food
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }

//         food = dish;
//         System.out.println("Chef prepared: " + food);
//         foodReady = true;
//         notify(); // Notify waiter that food is ready
//     }

//     // Waiter serves food
//     public synchronized void serveFood() {
//         while (!foodReady) {
//             try {
//                 System.out.println("Waiter waiting — no food ready yet...");
//                 wait(); // Wait until chef prepares food
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }

//         System.out.println("Waiter served: " + food);
//         foodReady = false;
//         notify(); // Notify chef to prepare next dish
//     }
// }

// class Chef extends Thread {
//     private Kitchen kitchen;

//     public Chef(Kitchen kitchen) {
//         this.kitchen = kitchen;
//     }

//     public void run() {
//         String[] dishes = {"Pasta", "Pizza", "Sandwich", "Burger", "Salad"};
//         for (String dish : dishes) {
//             kitchen.prepareFood(dish);
//             try {
//                 Thread.sleep(500); // simulate time to cook
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class Waiter extends Thread {
//     private Kitchen kitchen;

//     public Waiter(Kitchen kitchen) {
//         this.kitchen = kitchen;
//     }

//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             kitchen.serveFood();
//             try {
//                 Thread.sleep(800); // simulate time to serve
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// public class Intersync {
//     public static void main(String[] args) {
//         Kitchen kitchen = new Kitchen();

//         Chef chef = new Chef(kitchen);
//         Waiter waiter = new Waiter(kitchen);

//         chef.start();
//         waiter.start();
//     }
// }
