// public class Another {
//     public static void main(String[] args) {
//         try {
//             System.out.println("Starting file operation...");

//             // Inner try block 1 – File existence check
//             try {
//                 String fileName = null;
//                 if (fileName == null) {
//                     throw new NullPointerException("File name cannot be null!");
//                 }
//             } catch (NullPointerException e) {
//                 System.out.println("Inner catch 1: " + e.getMessage());
//             }

//             // Inner try block 2 – Read operation
//             try {
//                 String text = "123A";
//                 int number = Integer.parseInt(text); // ❌ NumberFormatException
//                 System.out.println("Converted number: " + number);
//             } catch (NumberFormatException e) {
//                 System.out.println("Inner catch 2: Invalid number format!");
//             }

//         } catch (java.lang.Exception e) {
//             System.out.println("Outer catch: Something went wrong!");
//         }

//         System.out.println("Operation completed successfully.");
//     }
// }


// public class Another {
//     public static void main(String[] args) {
//         try {
//             System.out.println("Outer try started.");

//             try {
                
//                 int[] arr = {1, 2, 3};
//                 System.out.println(arr[5]); // ❌ ArrayIndexOutOfBoundsException
//             } catch (ArrayIndexOutOfBoundsException e) {
//                 System.out.println("Inner catch: Invalid index!");
//             } finally {
//                 System.out.println("Inner finally: Always executed (cleanup done).");
//             }

//             int result = 10 / 0; // ❌ ArithmeticException
//             System.out.println(result);
//         } catch (ArithmeticException e) {
//             System.out.println("Outer catch: Division by zero!");
//         } finally {
//             System.out.println("Outer finally: Closing all resources.");
//         }
//     }
// }


// Base class (Parent)


import java.io.*;
class Parent {
    // Method that does not throw any checked exception
    void show() {
        System.out.println("Parent: showing details...");
    }

    // Method that throws a checked exception
    void display() throws java.lang.Exception {
        System.out.println("Parent: displaying info...");
    }
}

// Derived class (Child)
class Child extends Parent {
    // Overriding method with an unchecked exception (allowed)
    @Override
    void show() throws ArithmeticException {
        System.out.println("Child: showing details (unchecked exception allowed).");
        int result = 10 / 0; // This will throw ArithmeticException
    }

    // Overriding method with narrower checked exception (allowed)
    @Override
    void display() throws IOException {
        System.out.println("Child: displaying info (checked exception).");
        throw new IOException("I/O problem occurred in Child class!");
    }
}
public class Another {
    public static void main(String[] args) {
        Parent obj = new Child();

        try {
            obj.show(); // Will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught in main: " + e);
        }

        try {
            obj.display(); // Will throw IOException
        } catch (java.lang.Exception e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
    }
}
