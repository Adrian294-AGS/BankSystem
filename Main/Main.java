package Main;
import BankController.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // Create account through input
        System.out.print("Enter owner name: ");
        String name = sc.nextLine();

        System.out.print("Enter account number: ");
        String accNum = sc.nextLine();

        System.out.print("Initial deposit amount: ");
        double initialDeposit = sc.nextDouble();

        System.out.println("\nChoose Account Type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Checking Account");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        BankAccount account;

        // Use ENUM instead of plain number
        AccountType type;
        if (choice == 1) {
            type = AccountType.SAVINGS;
            account = new SavingsAccount(accNum, name, initialDeposit);
        } else {
            type = AccountType.CHECKING;
            account = new CheckingAccount(accNum, name, initialDeposit);
        }

        System.out.println("\nAccount Type Selected: " + type);

        // Menu
        while (true) {
            System.out.println("\n------ BANK MENU ------");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Print Account Details");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();

            if (option == 1) {
                System.out.print("Enter deposit amount: ");
                double amt = sc.nextDouble();
                account.deposit(amt);

            } else if (option == 2) {
                System.out.print("Enter withdrawal amount: ");
                double amt = sc.nextDouble();
                account.withdraw(amt);

            } else if (option == 3) {
                System.out.println("Current Balance: " + account.getBalance());

            } else if (option == 4) {
                account.printDetails();  // Interface method
            } else if (option == 5) {
                System.out.println("Thank you for using the Bank System!");
                break;

            } else {
                System.out.println("Invalid option!");
            }
        }

        sc.close();
    }
}
