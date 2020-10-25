public class Logika {
    public static void main(String[] args) {
        int angkaPertama = 5;
        int angkaKedua = 10;
        int angkaKetiga = 2;


        boolean pernyataan = angkaPertama<angkaKedua && angkaKedua>angkaKetiga;
        boolean pernyataanKedua = angkaPertama>angkaKedua || angkaKedua>angkaKetiga;
        boolean pernyataanKetiga = !pernyataanKedua;

        System.out.println("5<10 dan 10>2 = " + pernyataan);
        System.out.println("5>10 atau 10>2 = " + pernyataanKedua);
        System.out.println("!PeryataanKetiga = " + pernyataanKetiga);
    
        
        
    }
}
