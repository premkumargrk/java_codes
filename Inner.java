// Base class
class GrandParent {
    void message() {
        System.out.println("I am the GrandParent class");
    }

    // Inner class inside GrandParent
    class InnerGrandParent {
        void innerMessage() {
            System.out.println("I am an Inner class inside GrandParent");
        }
    }
}

// First-level child
class Parent extends GrandParent {
    void message() {
        System.out.println("I am the Parent class (overriding GrandParent)");
    }
}

// Second-level child
class Child extends Parent {
    void message() {
        System.out.println("I am the Child class (overriding Parent)");
    }
}

// Main class
public class Inner {
    public static void main(String[] args) {
        // Create object of Child (inherited from Parent -> GrandParent)
        Child c = new Child();
        c.message();  // Calls Child's version

        // Access inner class of GrandParent
        GrandParent gp = new GrandParent();
        GrandParent.InnerGrandParent inner = gp.new InnerGrandParent();
        inner.innerMessage();
    }
}
