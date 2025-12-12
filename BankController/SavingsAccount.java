package BankController;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, String ownerName, double balance) {
        super(accountNumber, ownerName, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Savings Withdrawal: " + amount);
        } else {
            System.out.println("Error: Insufficient balance in Savings Account!");
        }
    }

    // INTERFACE method implementation
    @Override
    public void printDetails() {
        System.out.println("\n--- Savings Account Details ---");
        System.out.println("Owner: " + ownerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
