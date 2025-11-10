public class LocalInner {

    void displayMessage() {
        // Local inner class inside a method
        class Message {
            void print() {
                System.out.println("Hello from Local Inner Class!");
            }
        }

        // Creating object inside same method
        Message msg = new Message();
        msg.print();
    }

    public static void main(String[] args) {
        LocalInner obj = new LocalInner();
        obj.displayMessage();
    }
}
