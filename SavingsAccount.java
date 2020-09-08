// Define a class
public class SavingsAccount {

    int balance;

    // Define class methods
    public SavingsAccount(final int initialBalance) {

        balance = initialBalance;
    }

    public void checkBalance() {

        System.out.println("\n");
        System.out.println("Your balance is: " + "$" + balance);
    }

    public void deposit(int amountToDeposit) {

        balance = balance + amountToDeposit;
        System.out.println("Amount of deposit: " + "$" + amountToDeposit);
    }

    public int withdraw(int amountToWithdraw) {

        balance = balance - amountToWithdraw;
        System.out.println("Amount of withdrawal: " + "$" + amountToWithdraw);

        return amountToWithdraw;
    }

    public String toString() {

        return "This is a savings account with: " + "$" + balance + " saved. \n";
    }

    // Main method
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount(2000);

        // Check balance
        savings.checkBalance();

        // Withdrawal
        savings.withdraw(300);

        // Check balance
        savings.checkBalance();

        // Deposit
        savings.deposit(600);

        // Check balance
        savings.checkBalance();

        // Deposit
        savings.deposit(600);

        // Check balance
        savings.checkBalance();

        System.out.println(savings);
    }
}