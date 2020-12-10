//untuk mengatur otomatis waktu sekarang
import java.util.Date;  
import java.text.DateFormat;  
import java.text.SimpleDateFormat;

import java.util.Calendar;
//fungsi-fungsi untuk mengambil input
import java.util.Scanner;

public class Maba {

    public static void main(String[] args) {

        Maba mb = new Maba();

        //untuk mengambil input
        var input = new Scanner(System.in);

        //menyimpan variabel sekarang
        Calendar kalender = Calendar.getInstance();
        int tahunSekarang = kalender.get(Calendar.YEAR);

        System.out.println("Silahkan Masukkan Nama Lengkap : ");
        String namaLengkap = input.nextLine();

        System.out.println("Silahkan Masukan Alamat : ");
        String alamat = input.nextLine();

        System.out.println("Silahkan Masukan Hobi : ");
        String hobi = input.nextLine();

        System.out.println("Silahkan Masukan Tahun Lahir (4 digit) : ");
        int tahunLahir = input.nextInt();
        int umur = tahunSekarang - tahunLahir;

        System.out.println("Silahkan Masukkan Tinggi Badan (Angka) : ");
        int tinggiBadan = input.nextInt();


        if (tinggiBadan >= 150)
            System.out.println("Nama : "+namaLengkap+"\nAlamat : "+alamat+"\n Hobi : "+hobi+"\nTinggi Badan"+tinggiBadan+" cm\nTahun Lahir : "+tahunLahir+"\nUmur : "+umur+"\n\nTanggal Pengisian : "+mb.getTanggal()+"\n\n 10 hari kemudian \n\n ---Selamat Anda Lolos Seleksi dikarenakan Anda Masuk Dalam Persyaratan---");
        else 
        System.out.println("Nama : "+namaLengkap+"\nAlamat : "+alamat+"\n Hobi : "+hobi+"\nTinggi Badan"+tinggiBadan+" cm\nTahun Lahir : "+tahunLahir+"\nUmur : "+umur+"\n\nTanggal Pengisian : "+mb.getTanggal()+"\n\n 10 hari kemudian \n\n ---Maaf Anda TIDAK Lolos Seleksi dikarenakan Tinggi Anda Tidak Sesuai Persyaratan---");
            

    }


//untuk mengambil data atau program tanggal sekarang
private String getTanggal() {  
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");  
    Date date = new Date();  
    return dateFormat.format(date);  
}

}

//referensi : http://jagocoding.com/tutorial/825/Menampilkan_waktu_sekarang_dengan_Java
//referensi : https://www.okedroid.com/2018/04/contoh-program-menghitung-umur-berdasarkan-tahun-lahir-di-java.html