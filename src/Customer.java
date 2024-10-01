public class Customer {
    private String name;          // Nama pelanggan
    private String address;       // Alamat pelanggan
    private String phoneNumber;   // Nomor telepon pelanggan

    // Konstruktor untuk Customer
    public Customer(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Metode untuk mencetak informasi pelanggan
    public void print() {
        System.out.println("Nama: " + name + ", Alamat: " + address + ", Telepon: " + phoneNumber);
    }
}

