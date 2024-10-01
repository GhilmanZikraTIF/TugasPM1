 public class AccountAbstarct extends AbstractBankAccount {
    // Konstruktor untuk Account
    public AccountAbstarct(String name, int num, int amt, AccountType type) {
        super(name, num, amt, type);
    }

    // Implementasi metode print
    @Override
    public void print() {
        System.out.println("Tipe Akun: " + SAVINGS);
        System.out.println(super.toString());
    }
}

