public class NestedInt {

    // Nested interface
    interface Message {
        void greet();
    }

    // Class implementing the nested interface
    static class InnerClass implements Message {
        public void greet() {
            System.out.println("Hello from Nested Interface Implementation!");
        }
    }

    public static void main(String[] args) {
        Message msg = new InnerClass();
        msg.greet();
    }
}
