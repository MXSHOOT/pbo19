import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class BuatFile {
  public static void main(String[] args) {
    try {
      File buatFile = new File("../Output/filebaru.txt");
      if (buatFile.createNewFile()) {
        System.out.println("Nama file adalah = " + buatFile.getName());
      } else {
        System.out.println("File sudah dibuat");
      }
    } catch (IOException e) {
      System.out.println("Terdapat error pada file");
      e.printStackTrace();
    }
  }
}