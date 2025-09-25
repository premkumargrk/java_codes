// Parent interface
interface BasicOperations {
    void displayOperation();
}

// Child interfaces extending parent
interface Addition extends BasicOperations {
    int add(int a, int b);
}

interface Subtraction extends BasicOperations {
    int subtract(int a, int b);
}

// Another independent interface
interface Multiplication {
    int multiply(int a, int b);
}

// Class implements multiple interfaces (hybrid inheritance)
class AdvancedCalculator implements Addition, Subtraction, Multiplication {
    public void displayOperation() {
        System.out.println("Performing Hybrid Inheritance Calculator");
    }
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public double divide(int a, int b) {
        return (double) a / b;
    }
}

public class Hybrid {
    public static void main(String[] args) {
        AdvancedCalculator calc = new AdvancedCalculator();
        calc.displayOperation();

        System.out.println("Addition: " + calc.add(12, 8));
        System.out.println("Subtraction: " + calc.subtract(20, 5));
        System.out.println("Multiplication: " + calc.multiply(6, 4));
        System.out.println("Division: " + calc.divide(15, 3));
    }
}
