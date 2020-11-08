import java.util.Scanner;

public class ListKarakter {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

       System.out.print("Masukan Jumlah karakter diavatar = ");
       int jumlah = scan.nextInt();

       String [] avatar= new String[jumlah];

       for(int i=0; i<jumlah; i++){
           System.out.print("Masukkan nama avatar = ");
           avatar[i] = scan.nextLine();
       }
       for(int i=0; i<avatar.length;i++){
           System.out.println("Avatar ke "+i+"adalah = "+avatar[i]);
       }
       
        // String karakterKartun [] {"Naruto", "Sasuke", "Sakura", "Kakashi"};

        // //Naruto nempatin posisi 0
        // //Sasuke  nempatin posisi 1
        // //Sakura  nempatin posisi 2
        // //Kakashi  nempatin posisi 3

        // System.out.println("Karakter kartun 0 = "+ karakterKartun[0]);
        // System.out.println("Karakter kartun 1 = "+ karakterKartun[1]);
        // System.out.println("Karakter kartun 2 = "+ karakterKartun[2]);
        // System.out.println("Karakter kartun 3 = "+ karakterKartun[3]);
        
        // String [] avatar = new String[4];
        // avatar[0] = "Kuruk";
        // avatar[1] = "Kyoshi";
        // avatar[2] = "Roku";
        // avatar[3] = "Aang";

        // avatar[3] = "Korra";

        // for (int i=0; i<avatar.length; i++) {
        //     System.out.println("Avatar ke " + i + "adalah = "+ avatar[i]);
        // }

    }
}
