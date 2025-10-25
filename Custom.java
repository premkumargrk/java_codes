// File: CustomExceptionDemo.java

// Custom checked exception 1
class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message); // Calls java.lang.Exception constructor
    }
}

// Custom checked exception 2
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// BankAccount class
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // deposit method
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be greater than zero.");
        }
        balance += amount;
    }

    // withdraw method
    public void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be greater than zero.");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance. Available: " + balance);
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

// Main class
public class Custom {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000);

        try {
            acc.deposit(500); // Valid deposit
            System.out.println("Balance after deposit: " + acc.getBalance());

            // Nested try block to handle a specific operation
            try {
                acc.withdraw(200);
                System.out.println("Balance after withdrawal: " + acc.getBalance());
            } catch (InvalidAmountException e) {
                System.out.println("Inner handler - invalid amount: " + e.getMessage());
            } catch (InsufficientBalanceException e) {
                System.out.println("Inner handler - insufficient funds: " + e.getMessage());
            }

            // This will trigger InsufficientBalanceException
            acc.withdraw(2000);

        } catch (InvalidAmountException e) {
            System.out.println("Outer handler - invalid amount: " + e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println("Outer handler - insufficient funds: " + e.getMessage());
        } finally {
            System.out.println("Final balance: " + acc.getBalance());
        }
    }
}
