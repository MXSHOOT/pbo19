import java.util.ArrayList;
import java.util.Scanner;

public class NasabahBank {
    public static void main(String[] args) {
       
        var input = new Scanner(System.in);
        ArrayList item = new ArrayList();

        System.out.println("Masukkan nama nasabah : ");
        String nasabah = input.nextLine();

        System.out.println("Jumlah uang : ");
        int jumlah = input.nextInt();

        item.add(nasabah);
        item.add(jumlah);

        System.out.println("1. Tambah\n2. Kurang ");
        System.out.print("Masukan Pilihan (1 or 2) : ");
        int memilih= input.nextInt();
        
        switch (memilih){
            case 1:
                System.out.println("ingin nambah : ");
                int tambah = input.nextInt();
                int hasilTambah = pertambahan(jumlah,tambah);
                System.out.println("Nama Nasabah : "+item.get(0)+
                                    "\nJumlah Tabungan Sebelum : "+item.get(1)+
                                    "\nHasil dari Penambahan Tabungan : "+hasilTambah);
                break;
            case 2:
                System.out.println("ingin kurang : ");
                int kurang = input.nextInt();
                int hasilPengurangan = pengurangan(jumlah, kurang);
                System.out.println("Nama Nasabah : "+item.get(0)+
                                    "\nJumlah Tabungan Sebelum : "+item.get(1)+
                                    "\nHasil dari Pengurangan Tabungan : "+hasilPengurangan);
                break;
            default:
                System.out.println("tidak tersedia");
                
        }

    }
    public static int pertambahan(int nilaiPertama, int nilaiKedua){
        int hasilPertambahan = nilaiPertama + nilaiKedua;

        return hasilPertambahan;
    }

    public static int pengurangan(int nilaiPertama, int nilaiKedua){
        int hasilPengurangan = nilaiPertama-nilaiKedua;

        return hasilPengurangan;
    }
}
