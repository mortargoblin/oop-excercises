public class BankAccount {
  private double balance = 0;
  private static int totalAccounts = 0;
  private int acctNumber;

  private BankAccount(int acctNumber) {
    totalAccounts++;
    this.acctNumber = acctNumber;
  }

  private void deposit(double funds) {
    balance += funds;
  }

  private void withdraw(double funds) {
    balance -= funds;
  }

  private int getAccountNumber() {
    return acctNumber;
  }

  private static int getTotalAccounts() {
    return totalAccounts;
  }

  private double getBalance() {
    return balance;
  }

  public static void main(String[] args) {
    // assuming the argument is account number???
    BankAccount account1 = new BankAccount(1000);
    BankAccount account2 = new BankAccount(2000);

    account1.deposit(500);
    account2.withdraw(800);

    System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
    System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

    System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
  }
}
