import java.util.Scanner;
public class PengukurGenGan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //Scanner ini anggap saja sebagai program untuk membuat inputan, agar dapat digunakan dan mudah untuk memanggil scanner tersebut
        //dibuat lah input sebagai variabelnya dan ditambah new, new ini mudahnya syarat untuk membuat suatu variabel baru dari library

        int memilih, awal, akhir;
        //mendekrelasikan pilihan, awal dan akhir dengan tipe data integer
        System.out.println("---------------------------------------------------------------------------------------|");
        System.out.println("---------PROGRAM MENAMPILKAN DERET BILANGAN GANJIL DAN GENAP---------------------------|");
        System.out.println("---------------------------------------------------------------------------------------|");
        System.out.println("\t\t\tCara Menggunakan\t\t\t\t\t       |\n\t\t\t\t\t\t\t\t\t\t       |");
        System.out.println("1. Pilih lah yang ingin dibuat loop (perulangan) berupa Ganjil atau Genap. \t       |\n2. ketik angka yang mau dibuat loop, bisa Ganjil atau Genap sesuai yang dipilih diawal.|\n3. setelah selesai menginput, akan keluar hasilnya berupa angka yang diinput \t       |\n   dengan bentuk Ganjil atau Genap sesuai yang dipilih diawal.\t\t\t       |");
        System.out.println("---------------------------------------------------------------------------------------|");
        System.out.println("1. Ganjil\n2. Genap ");
        System.out.print("Masukan Pilihan : ");
        memilih=input.nextInt();
        //membuat inputan untuk pilihan yang ingin dipilih
        System.out.println("--------------------------- ");

        System.out.print("Masukan Nilai Awal : ");
        awal=input.nextInt();
        System.out.print("Masukan Nilai Akhir : ");
        akhir=input.nextInt();
        //membuat inputan perulangan dengan diberikan pembatas

        System.out.println("--------------------------- ");

        switch (memilih){
            case 1 :  
                    System.out.println("Deret Bilangan Ganjil");
                    for(int i=awal;i<=akhir;i++){
                        //intinya i<=akhir ini kurang dari i=awal atau sebagai nilai batasnya
                        if (i%2!=0)
                        //2!=0 untuk menghitung bilangan ganjil
                        System.out.print(i+" ");
                    } 
                    //for ini singkatnya buat loopingnya
                    break;
                    //break ini singkatnya buat mengakhiri looping
            case 2 :
                    System.out.println("Deret Bilangan Genap");
                    for(int i=awal;i<=akhir;i++){
                        if (i%2==0)
                        //2!==0 untuk menghitung bilangan ganenap atau kelipatan 2
                        System.out.print(i+" ");
                    }
                    break;
            default:
                    System.out.println("Anda Tidak Memilih Pilihan Yang Sudah Ada");
                    break;
        }
        //switch case disini digunakan sebagai pilihan jika ingin genap atau ganjil yang akan diteruskan program sesuai yang dipilih atau singkatnya buat bikin cabang

        System.out.println("");
    }
}

//penggunaan print dengan println bedanya dibagian enternya atau pembuatan baris, simplenya print akan tampil disebelahnya(sesuai penempatan). kalau println akan dibawahnya
//saya menggunakan \n digunakan untuk membuat baris baru sama seperti println, tujuan saya menggunakan \n daripada println adalah dikarenakan kurang efisien dan termanage
//jika saya menggunakan println setiap membuat baris akan mengakibatkan bingung ini untuk teks atau apa, untuk lebih rapih bisa digunakan \t atau tab singkatnya buat jarak