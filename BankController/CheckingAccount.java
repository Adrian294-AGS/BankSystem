package BankController;

public class CheckingAccount extends BankAccount {

    private double overdraftLimit = 500;  // Encapsulation example

    public CheckingAccount(String accountNumber, String ownerName, double balance) {
        super(accountNumber, ownerName, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Checking Withdrawal: " + amount);
        } else {
            System.out.println("Error: Overdraft limit reached!");
        }
    }

    // INTERFACE method implementation
    @Override
    public void printDetails() {
        System.out.println("\n--- Checking Account Details ---");
        System.out.println("Owner: " + ownerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}