import java.util.Scanner;

class Kalkulator{
    public static void main(String args[])
    {
        Statistik stat = new Statistik();
        Scanner scan = new Scanner(System.in);

        // input panjang array dari user
        System.out.print("Masukkan angka yang diinginkan = ");
        int jumlah = scan.nextInt();

        int[] a = new int[jumlah];
        int n = a.length;

        //pengulangan dari input
        for(int j=0; j<n; j++){
            System.out.print("Masukkan angka = ");
            a[j] = scan.nextInt();
        }


        // memanggil function
        System.out.println("Mean = " + stat.mean(a, n));
        System.out.println("Median = " + stat.median(a, n));
        System.out.println("Modus = " + stat.modus(a, n));
    }
}