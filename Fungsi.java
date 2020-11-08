public class Fungsi {
    public static void main(String[] args) {

        int angkaPertama = 5;
        int angkaKedua = 10;
        
        int hasilPertambahan = Pertambahan(angkaPertama, angkaKedua);
        int hasilPertambahanKedua = Pertambahan(5, 40);

        System.out.println("Hasil Pertambahan dari "+
                            angkaPertama+"+"+angkaKedua+"="+hasilPertambahan);      

        System.out.println("Hasil pertambahan dari 1 + 30 "+hasilPertambahan);

    }

    public static int Pertambahan(int nilaiPertama, int nilaiKedua) {
        int nilaiKetiga = nilaiPertama + nilaiKedua;

        return nilaiKetiga;
        
    }



}
