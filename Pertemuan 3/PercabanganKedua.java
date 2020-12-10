import java.util.Scanner;

public class PercabanganKedua {
    public static void main(String[] args) {
        //new scanner atau bisa dikatakan membuat scanner baru
        //scan semacam inputan misal masukan hari jumat maka hasilnya default
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan hari = ");

        String hari = scan.nextLine();

        switch (hari) {
            case "senin":
                System.out.println("Sekarang hari senin, waktunya sekolah");
                break;
            case "selasa":
                System.out.println("Sekarang hari selasa, waktunya main");
                break;
            case "rabu":
                System.out.println("Sekarang hari rabu, waktunya ke event jepang");
                break;
            default:
                System.out.println("Sekarang hari yang biasa saja");
                break;

        }
        
    }
}
