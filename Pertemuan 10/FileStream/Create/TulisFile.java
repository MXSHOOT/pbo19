import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class TulisFile {
  public static void main(String[] args) {
    try {
      FileWriter tulisFile = new FileWriter("../Output/filebaru.txt");
      tulisFile.write("File ini ditulis dari java");
      tulisFile.close();
      System.out.println("File berhasil ditulis.");
    } catch (IOException e) {
      System.out.println("Terdapat error saat menulis file");
      e.printStackTrace();
    }
  }
}