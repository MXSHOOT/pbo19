class Kalkulator {
    
    public static void main(String[] args) {
        Aritmatika calcAritmatika = new Aritmatika();

        calcArtimatika.nilaiPertama(6);
        calcAritmatika.nilaiKedua(3);
        //tidak perlu mengisi 10,2 atau 5,3

        int Pertambahan = calcAritmatika.Pertambahan();//(10,2)
        int Pengurangan = calcAritmatika.Pengurangan();//(5,3)

        System.out.println("Hasil Pertambahan 10 + 2 = "+Pertambahan);
        System.out.println("Hasil Pertambahan 5 - 3 = "+Pengurangan);
    }
}
//tanda merah belum tentu salah