import java.io.File; 
import java.io.FileNotFoundException;  
import java.util.Scanner;

public class Read {
  public static void main(String[] args) {
    try {
      File biodata = new File("../Output/Biodata.txt");
      Scanner scan = new Scanner(biodata);
      while (scan.hasNextLine()) {
        String data = scan.nextLine();
        System.out.println(data);
      }
      scan.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}