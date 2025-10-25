// public class Exception{
//     public static void main(String[] args) {
//         try {
//             int a = 10 / 0; // risky code
//         } catch (ArithmeticException e) {
//             System.out.println("Error: Division by zero is not allowed.");
//         } finally {
//             System.out.println("This block always executes.");
//         }
//         System.out.println("Program continues normally...");
//     }
// }

// public class Example {
//     public static void main(String[] args) {
//         try {
//             int[] arr = {10, 20, 30};
//             System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
//         } catch (ArithmeticException e) {
//             System.out.println("Arithmetic error!");
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Array index error!");
//         } catch (java.lang.Exception e) {
//             System.out.println("Other error: " + e);
//         }
//         System.out.println("the final code of line....");
//     }
// }

// public class Example {
//     public static void main(String[] args) {
//         try {
//             int a = 10 / 2;
//             try {
//                 int[] arr = new int[3];
//                 arr[5] = 50;
//             } catch (ArrayIndexOutOfBoundsException e) {
//                 System.out.println("Inner catch: " + e);
//             }
//         } catch (ArithmeticException e) {
//             System.out.println("Outer catch: " + e);
//         }
//     }
// }

// public class Example{
//     public static void main(String[] args) {
//         int age = 15;
//         if (age < 18) {
//             throw new ArithmeticException("Not eligible to vote");
//         } else {
//             System.out.println("Eligible to vote");
//         }
//     }
// }

// public class Example {

//     static int divide(int a, int b) throws ArithmeticException {
//         if (b == 0) {
//             throw new ArithmeticException("Cannot divide by zero!");
//         }
//         return a / b;
//     }

//     static void checkAge(int age) throws java.lang.Exception {
//         if (age < 18) {
//             throw new java.lang.Exception("You must be at least 18 years old!");
//         }
//         System.out.println("Access granted – You are old enough!");
//     }

//     public static void main(String[] args) {
//         try {
//             int result = divide(10, 2);
//             System.out.println("Result: " + result);

//             checkAge(15); // This will throw Exception
//         } 
//         catch (ArithmeticException e) {
//             System.out.println("Arithmetic Exception: " + e.getMessage());
//         } 
//         catch (java.lang.Exception e) {
//             System.out.println("General Exception: " + e.getMessage());
//         }

//         System.out.println("Program continues after exception handling...");
//     }
// }
