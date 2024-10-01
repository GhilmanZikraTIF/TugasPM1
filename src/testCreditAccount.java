public class testCreditAccount {
	public static void main(String[] args) {

		AbstractBankAccount A1 = new AccountAbstarct("Indah Purnama Sari", 11556, 300, AccountType.SAVINGS);
		AbstractBankAccount A2 = new AccountAbstarct("Ghilman Zikra", 22338, 500, AccountType.SAVINGS);
		AbstractBankAccount A3 = new AccountAbstarct("Alya Elkamil", 44559, 1000, AccountType.SAVINGS);


		CreditAccount C1 = new CreditAccount("Rafani", 4578, 5900, 2000, AccountType.SAVINGS);
		CreditAccount C2 = new CreditAccount("Aulia", 66778, 1000, 500, AccountType.SAVINGS);


		A1.print();
		A2.print();
		A3.print();
		C1.print();
		C2.print();
	}
}
