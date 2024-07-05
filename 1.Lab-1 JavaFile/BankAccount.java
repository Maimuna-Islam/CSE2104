package bankaccount;
public class BankAccount {
    public String accountNumber;
    public double balance;
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public static void main(String[] args) {
        BankAccount myAccount1 = new BankAccount("231014030", 2000.00);
        
        myAccount1.deposit(1000.0);
        System.out.println("Balance after deposit: " + myAccount1.getBalance());
        myAccount1.withdraw(500.0);
        System.out.println("Balance after withdrawal: " + myAccount1.getBalance());
        
        BankAccount myAccount2 = new BankAccount("231014148", 5500.00);
        
        myAccount2.deposit(2300.0);
        System.out.println("Balance after deposit: " + myAccount2.getBalance());
        myAccount2.withdraw(1400.0);
        System.out.println("Balance after withdrawal: " + myAccount2.getBalance());
    }
}
