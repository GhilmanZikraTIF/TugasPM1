 public class TestCustomerAccount {
    public static void main(String[] args) {

        AbstractBankAccount A1 = new AccountAbstarct("Indah Purnama Sari", 11556, 300, AccountType.SAVINGS);
        AbstractBankAccount A2 = new AccountAbstarct("Ghilman Zikra", 22338, 500, AccountType.SAVINGS);
        AbstractBankAccount A3 = new AccountAbstarct("Alya Elkamil", 44559, 1000, AccountType.SAVINGS);


        Customer customer1 = new Customer("Indah Purnama Sari", "Jalan Raya 1", "08123456789");
        Customer customer2 = new Customer("Ghilman Zikra", "Jalan Raya 2", "08234567890");
        Customer customer3 = new Customer("Alya Elkamil", "Jalan Raya 3", "08345678901");

        System.out.println("Informasi Pelanggan dan Akun:");

        System.out.println("Pelanggan 1:");
        customer1.print();
        A1.print();

        System.out.println();

        System.out.println("Pelanggan 2:");
        customer2.print();
        A2.print();

        System.out.println();

        System.out.println("Pelanggan 3:");
        customer3.print();
        A3.print();
    }
}

