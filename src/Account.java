public class Account extends BankAccount {
	private int bonusValue;
	private AccountType type;

	// Konstruktor untuk Account
	public Account(String name, int num, int amt, AccountType type) {
		super(name, num, amt); // Memanggil konstruktor dari BankAccount
		this.bonusValue = calculateInitialBonusValue(amt); // Menghitung bonus awal
		this.type = type; // Menyimpan tipe akun
	}

	// Menghitung nilai bonus awal
	private int calculateInitialBonusValue(int amt) {
		return (int) (amt * 0.1);
	}

	// Override metode print
	@Override
	public void print() {
		super.print(); // Mencetak informasi akun dari BankAccount
		System.out.println("Tipe Akun: " + type.getCode() + ", Bonus: " + bonusValue);
	}

	// Getter untuk tipe akun
	public AccountType getType() {
		return type;
	}

	// Override metode toString
	@Override
	public String toString() {
		return "\nAccount Type: " + this.type.getCode() + super.toString(); // Memanggil toString() dari BankAccount
	}

	// Setters
	public void setAccountName(String name) {
		super.setAccountName(name); // Memanggil setter dari BankAccount
	}
}
