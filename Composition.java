class Heart {
    private String type;

    Heart(String type) {
        this.type = type;
    }

    void pump() {
        System.out.println("Heart (" + type + ") is pumping blood...");
    }
}

class Person {
    private Heart heart;  // Composition (Person owns Heart)

    Person() {
        // First class (Person) creates object of second class (Heart)
        this.heart = new Heart("Normal");
    }

    void live() {
        heart.pump();  // Person delegates work to Heart
        System.out.println("Person is alive!");
    }
}

public class Composition {
    public static void main(String[] args) {
        Person p = new Person();  
        p.live();
        // When Person is destroyed, Heart is destroyed too
    }
}
