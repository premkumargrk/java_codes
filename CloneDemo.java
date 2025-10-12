// Program: Demonstrating Object Cloning in Java

// Step 1: Create a class and implement Cloneable
class Student implements Cloneable {
    int id;
    String name;

    // Constructor to initialize fields
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Step 2: Override clone() method
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }

    // Step 3: Override toString() to print objects nicely
    @Override
    public String toString() {
        return "Student[ID=" + id + ", Name=" + name + "]";
    }
}

public class CloneDemo {
    public static void main(String[] args) {

        try {
            // Step 4: Create original object
            Student s1 = new Student(101, "Prem");
            System.out.println("Original Object: " + s1);

            // Step 5: Clone the original object to create a new object
            Student s2 = (Student) s1.clone();
            System.out.println("Cloned Object  : " + s2);

            // Step 6: Modify the cloned object
            s2.id = 102;
            s2.name = "Arun";

            // Step 7: Print both objects after modification
            System.out.println("\nAfter modifying the cloned object:");
            System.out.println("Original Object: " + s1); // remains unchanged
            System.out.println("Cloned Object  : " + s2); // modified

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported for this object.");
            e.printStackTrace();
        }
    }
}
