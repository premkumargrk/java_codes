class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        String a="Student [ID = " + id + ", Name = " + name + "]";
        Object cs= a instanceof String;
        return a+" "+cs;
    }
}

public class ToStringExample {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Prem");
        System.out.println(s1); // automatically calls toString()
        // Object cs=s1;
        // System.out.println(cs.getClass().getName());
;    }
}

// class Student {
//     int id;
//     String name;

//     Student(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     // Overriding equals() method
//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj) return true; // same reference
//         if (obj == null || getClass() != obj.getClass()) return false;

//         Student s = (Student) obj;
//         return this.id == s.id && this.name.equals(s.name);
//     }
// }

// public class ToStringEqualsExample {
//     public static void main(String[] args) {
//         Student s1 = new Student(101, "Prem");
//         Student s2 = new Student(101, "Prem");
//         Student s3 = new Student(102, "Arun");

//         System.out.println(s1.equals(s2)); // true
//         System.out.println(s1.equals(s3)); // false
//     }
// }
