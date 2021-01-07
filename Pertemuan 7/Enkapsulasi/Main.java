public class Main {
    public static void main(String args []) {
        Toko toko = new TokoGame();
        UserGame user = new UserGame(toko);

        user.harga(95000);
        user.jumlah(5);
        
        int harga = user.hargaBarang();
        int jumlah = user.jumlahBarang();

        System.out.println("harga game adalah = " + harga);
        System.out.println("jumlah game adalah = " + jumlah);

    }
}