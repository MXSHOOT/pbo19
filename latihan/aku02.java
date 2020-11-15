import java.util.Scanner;

class aku02 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Nilai awal : ");
        int nilai = input.nextInt();

        System.out.print("Masukan Nilai akhir : ");
        int nilai2 = input.nextInt();

        aku01 calcAku01 = new aku01();
        calcAku01.nilaiPertama(nilai);
        calcAku01.nilaiKedua(nilai2);
        //tidak perlu mengisi 10,2 atau 5,3

        int Pertambahan = calcAku01.Pertambahan();//(10,2)
        int Pengurangan = calcAku01.Pengurangan();//(5,3)

        System.out.println("Hasil Pertambahan "+nilai+" + "+nilai2+" = "+ Pertambahan);
        System.out.println("Hasil Pertambahan 5 - 3 = "+ Pengurangan);
    }
}
//tanda merah belum tentu salah