//library calender
import java.util.Calendar;

import java.io.*;

//library scanner
import java.util.Scanner;


class cekHarga {
  // Program utama
  // Deklarasi atrribut
  private String tipe;
  private int pilihMerek;
  private int pilihMemory;
  
  public static void main(String arg[]) {
    // Ciptakan objek
    cekHarga fd = new cekHarga();

    // Ciptakan inputan menggunakan scanner
    var input = new Scanner(System.in);

    // Penciptaan objek untuk pembacaan data dari keyboard
    InputStreamReader istream = new InputStreamReader(System.in);
    BufferedReader bufRead = new BufferedReader(istream);

    //membuat penamaan Caleder menjadi kalender
    Calendar kalender = Calendar.getInstance();

    int mer = 0;
    int mem = 0;

    //memilih tahun saja yang diambil
    int tahunSekarang = kalender.get(Calendar.YEAR);

        try {
            
            
        //menampilkan this
        fd.settk(50000, "Rifqi");
        fd.tampil();
        // Cek Harga Flashdisk
        System.out.println("\nFitur Cek Harga Flashdisk Toko Rifqi");
        System.out.println("---------------------------------------\n");

        System.out.println("Daftar Merek Flashdisk :");
        System.out.println("------------------------");
        System.out.println("1. Sandisk \n2. Kingstone \n3. Vgen \n4. Toshiba \n5. Samsung \n");
        System.out.print("Pilih Merek Flashdisk (1-5) : ");
        String mString = bufRead.readLine();
        mer = Integer.parseInt(mString);

        System.out.print('\u000C');
        System.out.println("-----------------------------");
        System.out.println("Daftar memory yang Tersedia :");
        System.out.println("-----------------------------");
        System.out.println("1. 8Gb \n2. 16Gb \n3. 32Gb \n4. 64Gb \n5. 128Gb \n");
        System.out.print("Pilih Memory (1-5) : ");
        String iString = bufRead.readLine();
        mem = Integer.parseInt(iString);

        // Manipulasi objek
        fd.setTipe("Flashdisk");  // tipe Flashdisk
        fd.setMerek(mer); // pilih merek fd
        fd.setMemory(mem);  // pilih memory
        
        
        System.out.print('\u000C');
        System.out.println("----------------------");
        System.out.println("Detail Informasi Data ");
        System.out.println("----------------------");
        System.out.println();
        System.out.println("Tipe Barang   : "+fd.getTipe());
        System.out.println("Merek  : "+fd.getNamaMerek());
        System.out.println("Memory : " + fd.getNamaMemory());
        System.out.println("Harga : " + fd.getHarga());

        //menginput string dan int 
        System.out.println("Regis biodata pembeli");
        System.out.println("Masukan Nama Anda: ");
        String nama=input.nextLine();
        System.out.println("Masukan Alamat Anda : ");
        String alamat=input.nextLine();

        //menggabungkan tahun sekarang dengan tahun lahir 
        System.out.println("Silahkan Masukan Tahun Lahir (4 digit) : ");
        int tahunLahir = input.nextInt();
        int umur = tahunSekarang - tahunLahir;

        //hasil dari inputan
        System.out.println("Terima kasih "+nama+" Telah mendapaftar di Rafi Toko\nUmur Anda"+umur+" Saya Akan langsung kirim ke"+alamat);
        System.out.println("Berikan berapa anda menyukai toko kami dari 0-100");
        int hasil=input.nextInt();
        System.out.println("Terima kasih atas nilai anda sebanyak "+hasil+" Kami akan berusaha agar menjadi lebih baik");
        
        //return
        System.out.println("\n\n Jangan lupa datang juga ke toko "+fd.tk2()+" yang memiliki pelanggan setia sebesar "+fd.pg()+"\n jadi ayok datang ke toko "+fd.tk2());
        

        }
        catch (IOException err) {
            err.printStackTrace();
        System.out.println("Proses pembacaan gagal!");
        }
        catch (NumberFormatException err) {
            err.printStackTrace();
        System.out.println("Nilai input tidak valid!");
        }
    }
  

  // Konstruktor
  public cekHarga(){
    tipe = "Barang";
    pilihMerek = 0;
    pilihMemory = 0;
  }

  // Selector
  public String getTipe() {
    return(tipe);
  }

  public int getMerek() {
    return(pilihMerek);
  }

  public int getInternal() {
    return(pilihMemory);
  }

  public String getNamaMerek() {
    String nama[] = new String[5];
    nama[0] = "Sandisk";
    nama[1] = "Kingstone";
    nama[2] = "Vgen";
    nama[3] = "Toshiba";
    nama[4] = "Samsung";

    return(nama[pilihMerek-1]);
  }

  public String getNamaMemory() {
    String namaMemory[] = new String[5];
    namaMemory[0] = "8 GB";
    namaMemory[1] = "16 GB";
    namaMemory[2] = "32 GB";
    namaMemory[3] = "64 GB";
    namaMemory[4] = "128 GB";

    return(namaMemory[pilihMemory-1]);
  }
  
  public String getHarga() {
    String harga[] = new String[5];
    harga[0] = "Rp.50.000,-";
    harga[1] = "Rp.75.000,-";
    harga[2] = "Rp.95.000,-";
    harga[3] = "Rp.120.000,-";
    harga[4] = "Rp.150.000,-";

    return(harga[pilihMemory-1]);
  }

  // Mutator
  public void setTipe(String t) {
    tipe = t;
  }

  public void setMerek(int m) {
    pilihMerek = m;
  }

  public void setMemory(int i) {
    pilihMemory = i;
  }

  //this
  int hf;
  String tk;
  void settk(int hf, String tk){
    this.hf = hf;
    this.tk = tk;
  }
  void tampil(){
    System.out.println("Toko "+tk+" menjual barang paling murah, minimal yang dijual "+hf);
  }

  //return
  String toko2 = "Antoku";
  String tk2(){
    return toko2;
  }
  int pg=200;
  int pg(){
    return pg;
  }
  

 
}class test2 {
    
}
