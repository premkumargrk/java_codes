//without using sync
// class Printer {
//     void printDocuments(String docName) {
//         for (int i = 1; i <= 3; i++) {
//             System.out.println(docName + " - Page " + i);
//             try { Thread.sleep(500); } catch (java.lang.Exception e) {}
//         }
//     }
// }

// public class Syncblk {
//     public static void main(String[] args) {
//         Printer printer = new Printer();

//         Thread t1 = new Thread(() -> printer.printDocuments("File1"));
//         Thread t2 = new Thread(() -> printer.printDocuments("File2"));

//         t1.start();
//         t2.start();
//     }
// }


//using synchronized

class Printer {
    void printDocuments(String docName) {
        synchronized (this) {  // Lock only this section
            for (int i = 1; i <= 3; i++) {
                System.out.println(docName + " - Page " + i);
                try { Thread.sleep(500); } catch (java.lang.Exception e) {}
            }
        }
    }
}

public class Syncblk {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread t1 = new Thread(() -> printer.printDocuments("File1"));
        Thread t2 = new Thread(() -> printer.printDocuments("File2"));

        t1.start();
        t2.start();
    }
}
