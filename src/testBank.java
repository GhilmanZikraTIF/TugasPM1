
public class testBank {

	public static void main(String[] args) {

		Account A1 = new Account("Indah Purnama Sari", 11556, 300, AccountType.SAVINGS);
		Account A2 = new Account("Ghilman Zikra", 22338, 500, AccountType.SAVINGS);
		Account A3 = new Account("Alya Elkamil", 44559, 1000, AccountType.SAVINGS);

		// Print accounts
		System.out.println(A1);
		System.out.println(A2);
		System.out.println(A3);
		}
}
