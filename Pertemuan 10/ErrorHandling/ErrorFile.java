public class ErrorFile {
  static void checkAge(int age) {
    if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
    }
    else {
      System.out.println("Akses diberikan, umur telah mencukupi");
    }
  }

  public static void main(String[] args) {
    checkAge(20); // Set age to 15 (which is below 18...)

    try {
        checkAge(13);
    } catch (ArithmeticException e) {
        System.out.println("File error karena = " + e);
    }
  }
}