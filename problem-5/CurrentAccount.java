public class CurrentAccount extends Account {
    CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }
    public void deposit (double amount){
        this.balance += amount;
    }
    public void withdraw(double amount){
        if(this.balance - amount < 0) {
            throw new Error ("unable to withdraw from current");
        }
        this.balance -= amount;
    }
}
