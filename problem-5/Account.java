abstract public class Account {
    private int accountNumber;
    protected double balance;
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public double getBalance() {
        return this.balance;
    }
    public double getAccountNumber() {
        return this.accountNumber;
    }
}
