public class TokoGame implements Toko {

    public int hargaBarang(int harga) {
        int hargaGame = harga + ((harga * 10) / 100);
        
        return hargaGame;
    }

    public int jumlahBarang(int jumlah) {
        int jumlahGame =  jumlah * 2;

        return jumlahGame;
    }

}