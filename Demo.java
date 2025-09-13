// class Student {
//     String name;
//     int rollNo;

//     Student(String name, int rollNo) {
//         this.name = name;
//         this.rollNo = rollNo;
//     }

//     // Overriding toString()
//     @Override
//     public String toString() {
//         return "Student{name='" + name + "', rollNo=" + rollNo + "}";
//     }
// }

// public class Demo {
//     public static void main(String[] args) {
//         Student s1 = new Student("Prem", 101);

//         // Default: ClassName@hashcode
//         System.out.println(s1); // Auto calls toString()
//     }
// }


// import java.util.HashSet;

// class Student {
//     String name;
//     int rollNo;

//     Student(String name, int rollNo) {
//         this.name = name;
//         this.rollNo = rollNo;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj) return true;
//         if (!(obj instanceof Student)) return false;
//         Student s = (Student) obj;
//         return rollNo == s.rollNo && name.equals(s.name);
//     }

//     @Override
//     public int hashCode() {
//         return rollNo * 31 + name.hashCode();
//     }
// }

// public class Demo {
//     public static void main(String[] args) {
//         HashSet<Student> set = new HashSet<>();
//         set.add(new Student("Prem", 101));
//         set.add(new Student("same", 10)); // duplicate ignored due to equals() + hashCode()

//         System.out.println(set.size()); // 1
//     }
// }

// class Student {
//     String name;
//     int rollNo;

//     Student(String name, int rollNo) {
//         this.name = name;
//         this.rollNo = rollNo;
//     }

//     // Overriding toString()
//      @Override
//     public String val() {
//         return "Student{name='" + name + "', rollNo=" + rollNo + "}";
//     }
// }

// public class Demo {
//     public static void main(String[] args) {
//         Student s1 = new Student("Prem", 101);

//         // Default: ClassName@hashcode
//         System.out.println(s1); // Auto calls toString()
//     }
// }
class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Overriding equals() for logical equality
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // same reference
        if (obj == null || getClass() != obj.getClass()) return false;

        Student s = (Student) obj;
        return rollNo == s.rollNo && name.equals(s.name);
    }
}

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student("Prem", 101);
        Student s2 = new Student("Prem", 101);

        System.out.println(s1.equals(s2)); // true (because we overrode equals)
    }
}
