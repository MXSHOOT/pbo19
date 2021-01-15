import java.io.File;  

public class Deleted {
  public static void main(String[] args) { 
    File hapus = new File("../Output/Biodata.txt"); 
    if (hapus.delete()) { 
      System.out.println("File Deleted: " + hapus.getName());
    } else {
      System.out.println("Failure Deleted");
    } 
  } 
}