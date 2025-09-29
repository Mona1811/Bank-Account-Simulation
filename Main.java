package Bank_Account;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("1001", "Mona", 5000);
        Account acc2 = new Account("1002", "Nehru", 3000);

        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.transfer(acc2, 1500);

        acc1.displayAccount();
        acc2.displayAccount();

        acc1.showTransactionHistory();
        acc2.showTransactionHistory();
    }
}