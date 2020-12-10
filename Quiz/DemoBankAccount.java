public class DemoBankAccount {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Anto");
        BankAccount b2 = new BankAccount();

        b1.deposit(12000);
        b2.name("Bensi");
        b2.deposit(30000);

        System.out.println("==Acount Before==");
        b1.getAll();
        System.out.println("=======");
        b2.getAll();
        System.out.println("=======");
        System.out.println("===ACount After====");
        b1.transfer(4000,b2);
        b1.getAll();
        System.out.println("=======");
        b2.getAll();
        System.out.println("=======");
    }
}
