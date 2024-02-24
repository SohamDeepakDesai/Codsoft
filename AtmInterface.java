import java.util.*;
class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient Balance. Withdrawal failed....");
            return false;
        }
    }
}

class ATM {
    private BankAccount userAccount;
    private Scanner scanner;

    public ATM(BankAccount userAccount) {
        this.userAccount = userAccount;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("ATM Menu:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void PerformTran() {
        int choice;
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter withdrawal amount: ");   // Withdraw
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0) {
                        if (userAccount.withdraw(withdrawAmount)) {
                            System.out.println("Withdrawal successful. Remaining balance: " + userAccount.getBalance());
                        }
                    } else {
                        System.out.println("Invalid amount. Withdrawal failed.");
                    }
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");    // Deposit
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        userAccount.deposit(depositAmount);
                        System.out.println("Deposit successful. New balance: " + userAccount.getBalance());
                    } else {
                        System.out.println("Invalid amount. Deposit failed.");
                    }
                    break;
                case 3:
                    System.out.println("Current balance: " + userAccount.getBalance());    // Check Balance
                    break;
                case 4:
                    System.out.println("Exiting ATM .Thank you  !!!!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);
    }
}
public class AtmInterface {
    public static void main(String args[]) {
        BankAccount userAccount = new BankAccount(500);
        ATM atm = new ATM(userAccount);
        atm.PerformTran();
    }
}
