class BA {
    private double balance;
    public BA(double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        displayBalance();
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
        displayBalance();
    }
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }}
class SavingsAccount extends BA {
    private static final double WITHDRAWAL_LIMIT = 1000.0;
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
    @Override
    public void withdraw(double amount) {
        if (amount <= WITHDRAWAL_LIMIT) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal limit exceeded for Savings Account.");
        }}}
class CheckingAccount extends BA {
    private static final double WITHDRAWAL_FEE = 2.0;
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + WITHDRAWAL_FEE);
    }}
public class BankAccount {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1500);
        CheckingAccount checkingAccount = new CheckingAccount(2000);
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        savingsAccount.withdraw(1200);
        checkingAccount.deposit(800);
        checkingAccount.withdraw(300);
        checkingAccount.withdraw(1500);
    }}