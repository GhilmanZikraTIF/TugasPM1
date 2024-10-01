public class CreditAccount extends AbstractBankAccount {
	private int creditLimit;  // Limit kredit

	// Konstruktor untuk CreditAccount
	public CreditAccount(String name, int num, int amt, int creditLimit, AccountType type) {
		super(name, num, amt, type);
		this.creditLimit = creditLimit;
	}

	// Implementasi metode print
	@Override
	public void print() {
		System.out.println("Tipe Akun: " + SAVINGS);
		System.out.println("Limit Kredit: " + creditLimit);
		System.out.println(super.toString());
	}
}
