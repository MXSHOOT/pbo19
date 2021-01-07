import java.io.File; 

public class HapusFolder {
  public static void main(String[] args) { 
    File hapus = new File("../Output"); 
    if (hapus.delete()) { 
      System.out.println("Deleted the folder: " + hapus.getName());
    } else {
      System.out.println("Failed to delete the folder.");
    } 
  } 
}