import java.util.Scanner;
public class GradeNilai {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
    int nilai;

    System.out.print("Masukan Nama Anda : ");
    String nama = input.nextLine();
    //Untuk menginput berupa text menggunakan tipe data string

    System.out.print("Masukan Nilai PBO Anda : ");
    nilai=input.nextInt();
    if(nilai >= 0 && nilai < 30){
        System.out.print("Selamat "+nama+" Anda Mendapatkan Grade D dalam matkul PBO");
    }
    //&& ini sebagai and atau bisa value pertama atau kedua
    else if(nilai >= 30 && nilai < 50){
        System.out.print("Selamat "+nama+" Anda Mendapatkan Grade C dalam matkul PBO");
    }
    else if(nilai >= 50 && nilai <= 70){
        System.out.print("Selamat "+nama+" Anda Mendapatkan Grade B dalam matkul PBO");
    }
    else if(nilai >= 70 && nilai <= 100){
        System.out.print("Selamat "+nama+" Anda Mendapatkan Grade A dalam matkul PBO");
    }
    else{
        System.out.print("Error Tidak Ada Dalam Pilihan");
    }
    //semua percabangan memiliki hasil "Selamat (variabel nama) mendapatkan grade (sesuai inputan yang dibuat)"
    }
}