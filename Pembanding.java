public class Pembanding {
    
    public static void main(String[] args) {
        int angkaPertama = 5;
        int angkaKedua = 10;
        int angkaKetiga = 2;
        int angkaKeempat = 2;

        int nilaiSatu = 3; 
        int nilaiDua = 2;

        boolean lebihBesar = angkaKedua > angkaPertama;
        boolean lebihKecil = angkaKetiga != angkaPertama;
        boolean samaAngka = angkaKetiga >= angkaKeempat;
        boolean nilaiSama = nilaiSatu <= nilaiDua;

        System.out.println("hasil dari 10>5 adalah = " + lebihBesar);
        System.out.println("hasil dari 2!=5 adalah = " + lebihKecil);
        System.out.println("hasil dari 2==2 adalah = " + samaAngka);
        System.out.println("hasil dari 3<=2 adalah = " + nilaiSama);
    }
}
