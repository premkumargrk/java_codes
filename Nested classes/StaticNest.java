public class StaticNest {

    static class Nested {
        void show() {
            System.out.println("Hello from Static Nested Class!");
        }
    }

    public static void main(String[] args) {
        // No need to create outer class object
        StaticNest.Nested obj = new StaticNest.Nested();
        obj.show();
    }
}
