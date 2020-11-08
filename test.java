import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        ArrayList item = new ArrayList();

        System.out.println("Masukkan nama nasabah : ");
        String nasabah = input.nextLine();

        System.out.println("Jumlah uang : ");
        int jumlah = input.nextInt();

        item.add(nasabah);
        item.add(jumlah);

        System.out.println("Senjata "+item.get(0)+
                            "\nangaka "+item.get(1));
    }
}