public abstract class AbstractBankAccount {
    protected String accountName;  // Nama akun
    protected int accountNum;       // Nomor akun
    protected int balance;          // Saldo akun
    protected AccountType SAVINGS;     // Tipe akun

    // Konstruktor untuk AbstractBankAccount
    public AbstractBankAccount(String name, int num, int amt, AccountType SAVINGS) {
        this.accountName = name;
        this.accountNum = num;
        this.balance = amt;
        this.SAVINGS = AccountType.SAVINGS;

    }

    // Metode untuk melakukan deposit
    public void deposit(int amt) {
        balance += amt;
    }

    // Metode untuk melakukan penarikan
    public void withdraw(int amt) {
        if (amt <= balance) {  // Cek jika cukup saldo
            balance -= amt;
        } else {
            System.out.println("Saldo tidak cukup untuk melakukan penarikan.");
        }
    }

    // Accessor dan modifier
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

    // Metode abstrak untuk mencetak informasi akun
    public abstract void print();  // Metode ini harus diimplementasikan di kelas konkret

    // Metode toString untuk mendapatkan representasi string dari akun
    @Override
    public String toString() {
        return "Akun: " + accountName + ", Nomor: " + accountNum + ", Saldo: " + balance;
    }



}
