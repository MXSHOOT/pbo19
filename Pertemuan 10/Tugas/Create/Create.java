import java.io.FileWriter;   
import java.io.IOException; 
import java.util.Scanner;

public class Create {
  public static void main(String[] args) {
    var input = new Scanner(System.in);
    System.out.println("Silahkan Masukkan Nama Lengkap : ");
    String namaLengkap = input.nextLine();
    System.out.println("Silahkan Masukkan Nama Jurusan : ");
    String jurusan = input.nextLine();
    System.out.println("Silahkan Masukkan NIM : ");
    int nim = input.nextInt();
    System.out.println("Silahkan Masukkan Semester Sekarang : ");
    int semester = input.nextInt();
    try {
      FileWriter tulisFile = new FileWriter("../Output/Biodata.txt");
      tulisFile.write("BIODATA\nNama Lengkap : " + namaLengkap+"\nNIM : "+nim+"\nJurusan : "+jurusan+"\nSemester : "+semester);
      tulisFile.close();
      System.out.println("Biodata Sudah Dibuat.");
    } catch (IOException e) {
      System.out.println("Terdapat error terhadap file");
      e.printStackTrace();
    }
  }
}