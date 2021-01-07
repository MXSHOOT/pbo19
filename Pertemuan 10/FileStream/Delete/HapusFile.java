import java.io.File;  // Import the File class

public class HapusFile {
  public static void main(String[] args) { 
    File hapus = new File("../Output/filebaru.txt"); 
    if (hapus.delete()) { 
      System.out.println("File yang dihapus: " + hapus.getName());
    } else {
      System.out.println("Gagal menghapus file");
    } 
  } 
}