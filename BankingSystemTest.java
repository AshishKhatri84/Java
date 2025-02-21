import java.util.*;

// Account interface
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

// Bank class
class Bank {
    private List<Account> accounts = new ArrayList<>();
    public void addAccount(Account account) { accounts.add(account); }
    public void showBalances() { accounts.forEach(a -> System.out.println("Balance: $" + a.getBalance())); }
}

// Savings Account
class SavingsAccount implements Account {
    private double balance, interestRate;
    public SavingsAccount(double balance, double interestRate) { this.balance = balance; this.interestRate = interestRate; }
    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { balance = (amount <= balance) ? balance - amount : balance; }
    public double getBalance() { return balance; }
    public void addInterest() { balance += balance * interestRate; }
}

// Current Account
class CurrentAccount implements Account {
    private double balance, overdraftLimit;
    public CurrentAccount(double balance, double overdraftLimit) { this.balance = balance; this.overdraftLimit = overdraftLimit; }
    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { balance = (amount <= balance + overdraftLimit) ? balance - amount : balance; }
    public double getBalance() { return balance; }
}

// Main Test Class
public class BankingSystemTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        SavingsAccount savings = new SavingsAccount(1000, 0.05);
        CurrentAccount current = new CurrentAccount(500, 200);

        bank.addAccount(savings);
        bank.addAccount(current);

        savings.deposit(500); savings.addInterest();
        current.withdraw(300);

        bank.showBalances();
    }
}