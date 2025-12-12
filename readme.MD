# Bank System (Java OOP Project)

A simple console-based banking application demonstrating the **four pillars of Object-Oriented Programming (OOP)** in Java:

- Encapsulation

- Inheritance

- Polymorphism

- Abstraction

The program also uses:

- Interfaces

- Enums

- Scanner input

- Packages (Main & BankController)

## 📌 Features

✔ Create an account (Savings or Checking)
✔ Deposit money
✔ Withdraw money
✔ Check account balance
✔ Print full account details
✔ Uses modern OOP concepts
✔ Supports multiple packages for clean organization

## 📌 OOP Concepts Used
### 1. Abstraction

BankAccount is an abstract class that represents a generic bank account.
It contains an abstract method:
```java
public abstract void withdraw(double amount);
```

This forces subclasses to create their own withdrawal rules.

### 2. Inheritance

SavingsAccount and CheckingAccount both extend BankAccount:
```java
class SavingsAccount extends BankAccount { ... }
class CheckingAccount extends BankAccount { ... }
```

Both children inherit attributes and methods from the parent.

### 3. Polymorphism

Two types used:

- Runtime Polymorphism (Overriding)

- Both subclasses override:

```java
@Override
public void withdraw(double amount)
```
- Compile-time Polymorphism (Overloading)

Deposit method is overloaded:
```java
public void deposit(double amount);
public void deposit(double amount, String note);
```

### 4. Encapsulation

Variables like balance, accountNumber, and ownerName are protected.
Some fields like overdraftLimit are private in CheckingAccount.

### 📌 Interface Used

Printable interface forces accounts to implement:

```java
void printDetails();
```

This ensures all account types can print their own information.

### 📌 Enum Used

AccountType enum improves code readability:
```java
enum AccountType { SAVINGS, CHECKING }
```
## 🖥 How the Program Works
### 1. User enters:

Name

- Account number

- Initial deposit

- Account type (Savings / Checking)

### 2. System creates the account using constructor + super().
### 3. User interacts with menu:
```MD
1. Deposit
2. Withdraw
3. Check Balance
4. Print Account Details
5. Exit
```
### 4. OOP features run in the background:

- Withdraw rules depend on the account type (polymorphism)

- All accounts support printing details (interface)

- Child classes use parent properties (inheritance)

- Sensitive data kept protected (encapsulation)

### 📌 Example Output
```MD
Enter owner name: Adrian Santiago
Enter account number: 12345
Initial deposit amount: 5000

Choose Account Type:
1. Savings Account
2. Checking Account
Enter choice: 1

Account Type Selected: SAVINGS

------ BANK MENU ------
1. Deposit
2. Withdraw
3. Check Balance
4. Print Account Details
5. Exit
Choose an option:
```