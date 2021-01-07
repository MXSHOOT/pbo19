import java.io.File;  // Import the File class

public class InformasiFile { 
  public static void main(String[] args) {
    File informasiFile = new File("../Output/filebaru.txt");
    if (informasiFile.exists()) {
      System.out.println("Nama file = " + informasiFile.getName());
      System.out.println("Alamat file = " + informasiFile.getAbsolutePath());
      System.out.println("Apakah file boleh ditulis ? " + informasiFile.canWrite());
      System.out.println("Apakah file data dibaca ? " + informasiFile.canRead());
      System.out.println("Ukuran file " + informasiFile.length());
    } else {
      System.out.println("File tidak ada");
    }
  }
}