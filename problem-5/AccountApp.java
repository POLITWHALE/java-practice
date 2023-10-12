public class AccountApp {
    public static void main(String[] args) {
        testSavingsAccount();
        testCurrentAccount();
    }

    public static void testSavingsAccount() {
        SavingsAccount savingsAccount = new SavingsAccount("SA001", 1000.0, 0.05);

        // Test deposit
        savingsAccount.deposit(500.0);
        if (savingsAccount.getBalance() == 1500.0) {
            System.out.println("Savings Account - Deposit Test: Passed");
        } else {
            System.out.println("Savings Account - Deposit Test: Failed");
        }

        // Test withdraw
        savingsAccount.withdraw(200.0);
        if (savingsAccount.getBalance() == 1300.0) {
            System.out.println("Savings Account - Withdraw Test: Passed");
        } else {
            System.out.println("Savings Account - Withdraw Test: Failed");
        }

        // Test add interest
        savingsAccount.addInterest();
        if (savingsAccount.getBalance() == 1365.0) {
            System.out.println("Savings Account - Add Interest Test: Passed");
        } else {
            System.out.println("Savings Account - Add Interest Test: Failed");
        }
    }

    public static void testCurrentAccount() {
        CurrentAccount currentAccount = new CurrentAccount("CA001", 2000.0, 1000.0);

        // Test deposit
        currentAccount.deposit(800.0);
        if (currentAccount.getBalance() == 2800.0) {
            System.out.println("Current Account - Deposit Test: Passed");
        } else {
            System.out.println("Current Account - Deposit Test: Failed");
        }

        // Test withdraw
        currentAccount.withdraw(2500.0);
        if (currentAccount.getBalance() == 2800.0) {
            System.out.println("Current Account - Withdraw Test: Passed");
        } else {
            System.out.println("Current Account - Withdraw Test: Failed");
        }
    }
}
