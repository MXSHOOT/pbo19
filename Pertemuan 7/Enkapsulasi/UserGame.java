public class UserGame {
    private Toko toko;
    private int hargaGame;
    private int jumlahGame;

    public UserGame(Toko toko) {
        this.toko = toko;
    }
    
    public void harga(int hargaGame) {
        this.hargaGame = hargaGame;
    }

    public void jumlah(int jumlahGame) {
        this.jumlahGame = jumlahGame;
    }

    public int hargaBarang() {
        int harga = this.toko.hargaBarang(hargaGame);
        return harga;
    }

    public int jumlahBarang() {
        int jumlah = this.toko.jumlahBarang(jumlahGame);
        return jumlah;
    }

}