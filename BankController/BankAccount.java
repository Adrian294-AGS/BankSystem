package BankController;

public abstract class BankAccount implements Printable {
    protected String accountNumber;
    protected String ownerName;
    protected double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public abstract void withdraw(double amount);

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Compile-time polymorphism (overloading)
    public void deposit(double amount, String note) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Note: " + note);
    }

    public double getBalance() {
        return balance;
    }
}
