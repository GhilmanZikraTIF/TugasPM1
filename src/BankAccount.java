public class BankAccount {

    protected String accountName;
    protected int accountNum;
    protected int balance;

    public BankAccount() {
        this.accountName = "EMPTY";
        this.accountNum = 0;
        this.balance = 0;
    }

    public BankAccount(String name, int num, int amt) {
        this.accountName = name;
        this.accountNum = num;
        this.balance = amt;
    }

    public void deposit(int amt) {
        balance += amt;
    }

    public void withdraw(int amt) {
        if (amt <= balance) {  // Cek jika cukup saldo
            balance -= amt;
        } else {
            System.out.println("Saldo tidak cukup untuk melakukan penarikan.");
        }
    }

    public void setAccountName(String name) {
        accountName = name;
    }

    public void setAccountNum(int num) {
        accountNum = num;
    }

    public void setBalance(int amt) {
        balance = amt;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public int getBalance() {
        return balance;
    }

    public void print() {
        System.out.println("Akun: " + accountName + ", Nomor: " + accountNum + ", Saldo: " + balance);
    }

    @Override
    public String toString() {
        return "Akun: " + accountName + ", Nomor: " + accountNum + ", Saldo: " + balance;
    }



}
