public class FileError {
  public static void main(String[ ] args) {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
        System.out.println("Terdapat error");
    } finally {
        System.out.println("Try catch berhasil kita jalankan");
    }

    System.out.println("hahahaha");
  }
}