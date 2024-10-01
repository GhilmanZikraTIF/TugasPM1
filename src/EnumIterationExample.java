public class EnumIterationExample {
    public static void main(String[] args) {

        for (AccountType act : AccountType.values()) {
            System.out.println("Nilai: " + act.name() + ", posisi: " + act.ordinal());
        }
    }
}
