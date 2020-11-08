package latihan;

public class Latihan01 {
    static void nama(){
        System.out.println("Saya adalah salman");
    }
    void tampil(){
        Latihan01.nama();
    }
    public static void main(String[] args){
           Latihan01 main = new Latihan01();
           main.tampil();
           Latihan01.nama();
    }
}



// - minimal 3 class (1 utama, 2 pendukung)
// - ada objek dari class pendukung
// - menggunakan konstruktor dan keyword this
// - minimal 2 void dan 2 return
// - menggunakan input masukan data (scanner)